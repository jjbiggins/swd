import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class WordToGuess extends JFrame{

    private final JPasswordField passwordField;
    private JLabel passwordLabel;
    private JLabel userLetterGuessLabel;
    private JLabel incorrectLettersGuessedLabel;
    private JLabel numberOfGuessesLeftLabel;
    private JLabel userReadOutLabel;
    private final FlowLayout window;
    private JTextField userLetterGuess;
    private JTextField numberOfGuessesLeft;
    private JTextField incorrectLettersGuessed;
    private JTextField userReadOut;
    private int numberLettersLeft;
    private int guessesLeft;
    private String correctGuesses;



    public WordToGuess(){
        super("Hangman Game");

        window = new FlowLayout();
        setBackground(Color.BLACK);
        setLayout(window);

        guessesLeft = 6;

        userLetterGuessLabel = new JLabel("Guess a letter: ");
        userLetterGuess = new JTextField(10);
        userLetterGuess.setFont(new Font("Serif", Font.PLAIN, 30));
        userLetterGuessLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        add(userLetterGuessLabel);
        add(userLetterGuess);
        userLetterGuess.setVisible(false);
        userLetterGuessLabel.setVisible(false);

        numberOfGuessesLeftLabel = new JLabel("Number of guesses left: ");
        numberOfGuessesLeft = new JTextField("6");
        numberOfGuessesLeftLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        numberOfGuessesLeft.setFont(new Font("Serif", Font.PLAIN, 30));
        numberOfGuessesLeft.setEditable(false);
        add(numberOfGuessesLeftLabel);
        add(numberOfGuessesLeft);
        numberOfGuessesLeft.setVisible(false);
        numberOfGuessesLeftLabel.setVisible(false);

        incorrectLettersGuessedLabel = new JLabel("Incorrect letters guessed: ");
        incorrectLettersGuessed = new JTextField( 5);
        incorrectLettersGuessed.setEditable(false);
        incorrectLettersGuessedLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        incorrectLettersGuessed.setFont(new Font("Serif", Font.PLAIN, 30));;
        add(incorrectLettersGuessedLabel);
        add(incorrectLettersGuessed);
        incorrectLettersGuessed.setVisible(false);
        incorrectLettersGuessedLabel.setVisible(false);

        userReadOutLabel = new JLabel("Current game state");
        userReadOut = new JTextField( 50);
        userReadOutLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        userReadOut.setFont(new Font("Serif", Font.PLAIN, 30));
        userReadOut.setEditable(false);
        add(userReadOutLabel);
        add(userReadOut);
        userReadOut.setVisible(false);
        userReadOutLabel.setVisible(false);


        passwordLabel = new JLabel("Enter word to be guessed:");
        passwordField = new JPasswordField(10);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        passwordField.setFont(new Font("Serif", Font.PLAIN, 20));
        add(passwordLabel);
        add(passwordField);


        TextFieldHandler handler = new TextFieldHandler();
        passwordField.addActionListener(handler);
        userLetterGuess.addActionListener(handler);
    }



    private class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";
            // user pressed Enter in JTextField textField1
            if (event.getSource() == passwordField) {
                numberLettersLeft = passwordField.getPassword().length;
                passwordLabel.setVisible(false);
                passwordField.setVisible(false);

                userLetterGuess.setVisible(true);
                userLetterGuessLabel.setVisible(true);

                incorrectLettersGuessed.setVisible(true);
                incorrectLettersGuessedLabel.setVisible(true);

                numberOfGuessesLeft.setVisible(true);
                numberOfGuessesLeftLabel.setVisible(true);

                userReadOut.setVisible(true);
                userLetterGuessLabel.setVisible(true);
            }
            else if(event.getSource() == userLetterGuess){
                if(new String(passwordField.getPassword()).contains(userLetterGuess.getText())){
                    numberLettersLeft = numberLettersLeft - 1;
                    if(correctGuesses == null) {
                        correctGuesses = userLetterGuess.getText();
                    }
                    else{
                        correctGuesses =  userLetterGuess.getText() + ", " + correctGuesses;
                    }
                    userReadOut.setText("Letters guessed correctly: " + correctGuesses +
                                        "   |   " + "Number of letters left: " + numberLettersLeft);
                }
                else{
                    guessesLeft = guessesLeft - 1;
                    incorrectLettersGuessed.setText(userLetterGuess.getText() + ", " + incorrectLettersGuessed.getText());
                    numberOfGuessesLeft.setText("" + guessesLeft);
                }
            }
        }
    }

}


