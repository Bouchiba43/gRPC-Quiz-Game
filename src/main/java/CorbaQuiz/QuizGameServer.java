package CorbaQuiz;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class QuizGameServer {
    private Server server;
    private QuizGameDatabase database;

    public QuizGameServer() {
        database = QuizGameDatabase.getInstance();
    }

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new QuizGameImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private class QuizGameImpl extends QuizGameGrpc.QuizGameImplBase {
        @Override
        public void getQuiz(QuizOuterClass.Empty request, StreamObserver<QuizOuterClass.QuizSequence> responseObserver) {
            QuizOuterClass.QuizSequence sequence = QuizOuterClass.QuizSequence.newBuilder()
                    .addAllQuizzes(database.getAllQuizzes())
                    .build();
            responseObserver.onNext(sequence);
            responseObserver.onCompleted();
        }

        @Override
        public void getQuestion(QuizOuterClass.QuestionRequest request, StreamObserver<QuizOuterClass.Quiz> responseObserver) {
            QuizOuterClass.Quiz question = database.getQuestionById(request.getId());
            responseObserver.onNext(question);
            responseObserver.onCompleted();
        }


        @Override
        public void registerPlayer(QuizOuterClass.PlayerRegistration request, StreamObserver<QuizOuterClass.Empty> responseObserver) {
            database.registerPlayer(request.getPlayerName());
            responseObserver.onNext(QuizOuterClass.Empty.newBuilder().build());
            responseObserver.onCompleted();
        }

        @Override
        public void play(QuizOuterClass.PlayerMove request, StreamObserver<QuizOuterClass.Empty> responseObserver) {
            QuizOuterClass.Quiz quiz = database.getQuestionById(request.getQuizId());
            boolean isCorrect = quiz.getCorrectAnswer() == request.getSelectedAnswer();
            database.updatePlayerScore(request.getPlayerName(), isCorrect);

            responseObserver.onNext(QuizOuterClass.Empty.newBuilder().build());
            responseObserver.onCompleted();
        }

        @Override
        public void getPlayerScores(QuizOuterClass.Empty request, StreamObserver<QuizOuterClass.PlayerSequence> responseObserver) {
            QuizOuterClass.PlayerSequence sequence = QuizOuterClass.PlayerSequence.newBuilder()
                    .addAllPlayers(database.getPlayerScores())
                    .build();
            responseObserver.onNext(sequence);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        QuizGameServer server = new QuizGameServer();
        server.start();
        // Keep server running
        Thread.currentThread().join();
    }
}