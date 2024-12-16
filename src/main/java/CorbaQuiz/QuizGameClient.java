// QuizGameClient.java
package CorbaQuiz;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class QuizGameClient {
    private QuizGameGrpc.QuizGameBlockingStub blockingStub;
    private ManagedChannel channel;
    private String playerName;
    private List<QuizOuterClass.Quiz> quizzes;

    public QuizGameClient() {
        initializeChannel();
    }

    private void initializeChannel() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        blockingStub = QuizGameGrpc.newBlockingStub(channel);
    }

    public void registerPlayer(String playerName) {
        this.playerName = playerName;
        QuizOuterClass.PlayerRegistration request = QuizOuterClass.PlayerRegistration.newBuilder()
                .setPlayerName(playerName)
                .build();
        blockingStub.registerPlayer(request);
    }

    public List<QuizOuterClass.Quiz> loadQuizzes() {
        QuizOuterClass.QuizSequence quizSequence = blockingStub.getQuiz(QuizOuterClass.Empty.newBuilder().build());
        quizzes = quizSequence.getQuizzesList();
        return quizzes;
    }

    public boolean submitAnswer(int quizId, int selectedAnswer) {
        QuizOuterClass.PlayerMove move = QuizOuterClass.PlayerMove.newBuilder()
                .setPlayerName(playerName)
                .setQuizId(quizId)
                .setSelectedAnswer(selectedAnswer)
                .build();

        blockingStub.play(move);
        return true; // or implement more sophisticated response handling
    }

    public List<QuizOuterClass.Player> getFinalScores() {
        QuizOuterClass.PlayerSequence playerScores = blockingStub.getPlayerScores(QuizOuterClass.Empty.newBuilder().build());
        return playerScores.getPlayersList();
    }

    public int getPlayerScore() {
        QuizOuterClass.Player request = QuizOuterClass.Player.newBuilder()
                .setPlayerName(playerName)
                .build();

        QuizOuterClass.PlayerScore response = blockingStub.getPlayerScore(request);
        return response.getScore();
    }

    // Cleanup channel
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public String getPlayerName() {
        return playerName;
    }




}