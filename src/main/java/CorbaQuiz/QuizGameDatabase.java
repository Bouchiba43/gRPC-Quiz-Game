package CorbaQuiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class QuizGameDatabase {
    private static QuizGameDatabase instance;
    private List<QuizOuterClass.Quiz> quizzes;
    private Map<String, QuizOuterClass.Player> players;

    private QuizGameDatabase() {
        quizzes = new ArrayList<>();
        players = new HashMap<>();
        initializeQuizzes();
    }

    public static synchronized QuizGameDatabase getInstance() {
        if (instance == null) {
            instance = new QuizGameDatabase();
        }
        return instance;
    }

    private void initializeQuizzes() {
        // Sample quiz questions
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(1)
                .setQuestion("What is the capital of Kyrgyzstan?")
                .setAnswer1("Almaty")
                .setAnswer2("Bishkek")
                .setAnswer3("Astana")
                .setAnswer4("Tashkent")
                .setCorrectAnswer(2)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(2)
                .setQuestion("Who is credited with the discovery of the electron?")
                .setAnswer1("Isaac Newton")
                .setAnswer2("Albert Einstein")
                .setAnswer3("J.J. Thomson")
                .setAnswer4("Marie Curie")
                .setCorrectAnswer(3)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(3)
                .setQuestion("Which element has the chemical symbol 'W'?")
                .setAnswer1("Tungsten")
                .setAnswer2("Molybdenum")
                .setAnswer3("Wolfram")
                .setAnswer4("Zinc")
                .setCorrectAnswer(1)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(4)
                .setQuestion("In which year did the Battle of Waterloo occur?")
                .setAnswer1("1805")
                .setAnswer2("1815")
                .setAnswer3("1825")
                .setAnswer4("1799")
                .setCorrectAnswer(2)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(5)
                .setQuestion("What is the longest river in Asia?")
                .setAnswer1("Yangtze River")
                .setAnswer2("Mekong River")
                .setAnswer3("Amur River")
                .setAnswer4("Ganges River")
                .setCorrectAnswer(1)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(6)
                .setQuestion("Which philosopher is known for the quote 'I think, therefore I am'?")
                .setAnswer1("Immanuel Kant")
                .setAnswer2("René Descartes")
                .setAnswer3("John Locke")
                .setAnswer4("Friedrich Nietzsche")
                .setCorrectAnswer(2)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(7)
                .setQuestion("What is the name of the first artificial satellite launched into space?")
                .setAnswer1("Sputnik 1")
                .setAnswer2("Apollo 11")
                .setAnswer3("Explorer 1")
                .setAnswer4("Vostok 1")
                .setCorrectAnswer(1)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(8)
                .setQuestion("Who was the first woman to win a Nobel Prize?")
                .setAnswer1("Marie Curie")
                .setAnswer2("Dorothy Hodgkin")
                .setAnswer3("Rosalind Franklin")
                .setAnswer4("Madame Bovary")
                .setCorrectAnswer(1)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(9)
                .setQuestion("Which country was formerly known as Ceylon?")
                .setAnswer1("Sri Lanka")
                .setAnswer2("Thailand")
                .setAnswer3("Singapore")
                .setAnswer4("Myanmar")
                .setCorrectAnswer(1)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(10)
                .setQuestion("Which mathematician is known for the invention of the Cartesian coordinate system?")
                .setAnswer1("Euclid")
                .setAnswer2("René Descartes")
                .setAnswer3("Isaac Newton")
                .setAnswer4("Blaise Pascal")
                .setCorrectAnswer(2)
                .build());

    }

    public List<QuizOuterClass.Quiz> getAllQuizzes() {
        return new ArrayList<>(quizzes);
    }

    public QuizOuterClass.Quiz getQuestionById(int id) {
        return quizzes.stream()
                .filter(quiz -> quiz.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void registerPlayer(String playerName) {
        if (!players.containsKey(playerName)) {
            QuizOuterClass.Player newPlayer = QuizOuterClass.Player.newBuilder()
                    .setPlayerName(playerName)
                    .setScore(0)
                    .build();
            players.put(playerName, newPlayer);
        }
    }

    public void updatePlayerScore(String playerName, boolean isCorrect) {
        if (players.containsKey(playerName)) {
            QuizOuterClass.Player currentPlayer = players.get(playerName);
            int newScore = currentPlayer.getScore() + (isCorrect ? 10 : 0);
            QuizOuterClass.Player updatedPlayer = currentPlayer.toBuilder().setScore(newScore).build();
            players.put(playerName, updatedPlayer);
        }
    }

    public List<QuizOuterClass.Player> getPlayerScores() {
        return new ArrayList<>(players.values());
    }
}