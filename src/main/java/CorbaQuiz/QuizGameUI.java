package CorbaQuiz;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class QuizGameUI extends JFrame {
    private QuizGameClient quizClient;
    private List<QuizOuterClass.Quiz> quizzes;
    private int currentQuizIndex = 0;

    // UI Components
    private JLabel questionLabel;
    private JRadioButton[] answerButtons;
    private ButtonGroup buttonGroup;
    private JButton submitButton;
    private JLabel scoreLabel;

    public QuizGameUI() {
        quizClient = new QuizGameClient();
        initializeUI();
        registerPlayer();
        loadQuizzes();
    }

    private void initializeUI() {
        setTitle("Quiz Game");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(63, 81, 181));
        headerPanel.setPreferredSize(new Dimension(600, 50));
        headerPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Quiz Game", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        add(headerPanel, BorderLayout.NORTH);

        // Question Panel
        JPanel questionPanel = new JPanel();
        questionPanel.setBackground(Color.WHITE);
        questionPanel.setLayout(new BorderLayout());
        questionPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        questionLabel.setForeground(new Color(33, 33, 33));
        questionPanel.add(questionLabel, BorderLayout.NORTH);

        add(questionPanel, BorderLayout.CENTER);

        // Answers Panel
        JPanel answersPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        answersPanel.setBackground(Color.WHITE);
        answersPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        answerButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();

        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JRadioButton();
            answerButtons[i].setFont(new Font("Arial", Font.PLAIN, 14));
            answerButtons[i].setBackground(Color.WHITE);
            buttonGroup.add(answerButtons[i]);
            answersPanel.add(answerButtons[i]);
        }

        questionPanel.add(answersPanel, BorderLayout.CENTER);

        // Footer Panel
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(245, 245, 245));
        footerPanel.setLayout(new BorderLayout());
        footerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        submitButton = new JButton("Submit Answer");
        submitButton.setBackground(new Color(56, 142, 60));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));
        submitButton.setFocusPainted(false);
        submitButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitAnswer();
            }
        });

        footerPanel.add(submitButton, BorderLayout.EAST);

        scoreLabel = new JLabel("Score: 0", SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        scoreLabel.setForeground(new Color(33, 33, 33));
        footerPanel.add(scoreLabel, BorderLayout.WEST);

        add(footerPanel, BorderLayout.SOUTH);
    }

    private void registerPlayer() {
        JPanel registerPanel = new JPanel(new BorderLayout(10, 10));
        registerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel promptLabel = new JLabel("Enter your name:", SwingConstants.CENTER);
        promptLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        registerButton.setBackground(new Color(33, 150, 243));
        registerButton.setForeground(Color.WHITE);
        registerButton.addActionListener(e -> {
            String playerName = nameField.getText().trim();
            if (playerName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty. Defaulting to 'Anonymous'.",
                        "Info", JOptionPane.INFORMATION_MESSAGE);
                playerName = "Anonymous";
            }
            registerButton.setEnabled(false); // Disable button to prevent multiple clicks
            quizClient.registerPlayer(playerName);
            SwingUtilities.getWindowAncestor(registerPanel).dispose(); // Close the dialog
        });

        registerPanel.add(promptLabel, BorderLayout.NORTH);
        registerPanel.add(nameField, BorderLayout.CENTER);
        registerPanel.add(registerButton, BorderLayout.SOUTH);

        JOptionPane.showOptionDialog(this, registerPanel, "Player Registration",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{}, null);
    }



    private void loadQuizzes() {
        quizzes = quizClient.loadQuizzes();
        displayNextQuiz();
    }

    private void displayNextQuiz() {
        if (currentQuizIndex < quizzes.size()) {
            QuizOuterClass.Quiz currentQuiz = quizzes.get(currentQuizIndex);
            questionLabel.setText(currentQuiz.getQuestion());

            answerButtons[0].setText(currentQuiz.getAnswer1());
            answerButtons[1].setText(currentQuiz.getAnswer2());
            answerButtons[2].setText(currentQuiz.getAnswer3());
            answerButtons[3].setText(currentQuiz.getAnswer4());

            buttonGroup.clearSelection();
        } else {
            showFinalScores();
        }
    }

    private void submitAnswer() {
        int selectedAnswer = -1;
        for (int i = 0; i < 4; i++) {
            if (answerButtons[i].isSelected()) {
                selectedAnswer = i + 1;
                break;
            }
        }

        if (selectedAnswer == -1) {
            JOptionPane.showMessageDialog(this, "Please select an answer!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        QuizOuterClass.Quiz currentQuiz = quizzes.get(currentQuizIndex);
        quizClient.submitAnswer(currentQuiz.getId(), selectedAnswer);

        currentQuizIndex++;
        updateScoreLabel();
        displayNextQuiz();
    }

    private void updateScoreLabel() {
        int playerScore = quizClient.getFinalScores().stream()
                .filter(player -> player.getPlayerName().equals(quizClient.getPlayerName()))
                .mapToInt(QuizOuterClass.Player::getScore)
                .findFirst()
                .orElse(0);
        scoreLabel.setText("Score: " + playerScore);
    }

    private void showFinalScores() {
        JPanel scorePanel = new JPanel(new BorderLayout(10, 10));
        scorePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Final Scores", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JTextArea scoreTextArea = new JTextArea();
        scoreTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        scoreTextArea.setEditable(false);

        List<QuizOuterClass.Player> playerScores = quizClient.getFinalScores();
        StringBuilder scoreText = new StringBuilder();
        for (QuizOuterClass.Player player : playerScores) {
            scoreText.append(player.getPlayerName()).append(": ").append(player.getScore()).append(" points\n");
        }
        scoreTextArea.setText(scoreText.toString());

        JButton closeButton = new JButton("Close");
        closeButton.setFont(new Font("Arial", Font.BOLD, 14));
        closeButton.setBackground(new Color(244, 67, 54));
        closeButton.setForeground(Color.WHITE);
        closeButton.addActionListener(e -> dispose());

        scorePanel.add(titleLabel, BorderLayout.NORTH);
        scorePanel.add(new JScrollPane(scoreTextArea), BorderLayout.CENTER);
        scorePanel.add(closeButton, BorderLayout.SOUTH);

        JOptionPane.showOptionDialog(this, scorePanel, "Quiz Completed",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{}, null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new QuizGameUI().setVisible(true);
        });
    }
}
