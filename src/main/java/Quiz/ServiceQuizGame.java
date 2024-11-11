package Quiz;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceQuizGame extends QuizGameGrpc.QuizGameImplBase {

    private final List<QuizOuterClass.Quiz> quizzes;
    private final Map<String, QuizOuterClass.Player> players;

    public ServiceQuizGame() {
        quizzes = new ArrayList<>();
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(1)
                .setQuestion("What is the capital of France?")
                .setAnswer1("Paris")
                .setAnswer2("London")
                .setAnswer3("Berlin")
                .setAnswer4("Madrid")
                .setCorrectAnswer(1)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(2)
                .setQuestion("What is 2 + 2?")
                .setAnswer1("3")
                .setAnswer2("4")
                .setAnswer3("5")
                .setAnswer4("6")
                .setCorrectAnswer(2)
                .build());

        players = new HashMap<>();
    }

    @Override
    public void getQuiz(Empty request, StreamObserver<QuizOuterClass.QuizSequence> responseObserver) {
        QuizOuterClass.QuizSequence quizSequence = QuizOuterClass.QuizSequence.newBuilder()
                .addAllQuizzes(quizzes)
                .build();
        responseObserver.onNext(quizSequence);
        responseObserver.onCompleted();
    }

    @Override
    public void getQuestion(QuizOuterClass.QuizId request, StreamObserver<QuizOuterClass.Quiz> responseObserver) {
        long quizId = request.getId();
        for (QuizOuterClass.Quiz quiz : quizzes) {
            if (quiz.getId() == quizId) {
                responseObserver.onNext(quiz);
                responseObserver.onCompleted();
                return;
            }
        }
        responseObserver.onError(new Throwable("Quiz not found"));
    }

    @Override
    public void registerPlayer(QuizOuterClass.RegisterPlayerRequest request, StreamObserver<Empty> responseObserver) {
        String playerName = request.getPlayerName();
        if (players.containsKey(playerName)) {
            responseObserver.onError(new Throwable("Player already registered"));
            return;
        }

        QuizOuterClass.Player player = QuizOuterClass.Player.newBuilder()
                .setPlayerName(playerName)
                .setScore(0)
                .build();
        players.put(playerName, player);

        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void play(QuizOuterClass.PlayRequest request, StreamObserver<Empty> responseObserver) {
        String playerName = request.getPlayerName();
        QuizOuterClass.Player player = players.get(playerName);

        if (player == null) {
            responseObserver.onError(new Throwable("Player not registered"));
            return;
        }

        long correctAnswer = 0;
        for (QuizOuterClass.Quiz quiz : quizzes) {
            if (quiz.getId() == request.getQuizId()) {
                correctAnswer = quiz.getCorrectAnswer();
                break;
            }
        }

        if (correctAnswer == 0) {
            responseObserver.onError(new Throwable("Quiz not found"));
            return;
        }

        if (request.getSelectedAnswer() == correctAnswer) {
            players.put(playerName, QuizOuterClass.Player.newBuilder(player)
                    .setScore(player.getScore() + 1)
                    .build());
        }

        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void getPlayerScores(Empty request, StreamObserver<QuizOuterClass.PlayerSequence> responseObserver) {
        QuizOuterClass.PlayerSequence playerSequence = QuizOuterClass.PlayerSequence.newBuilder()
                .addAllPlayers(players.values())
                .build();
        responseObserver.onNext(playerSequence);
        responseObserver.onCompleted();
    }
}
