import javax.swing.*;
import javax.swing.JFrame;

public class HangmanDriver {
    public static void main(String args[]){
        WordToGuess textFieldFrame = new WordToGuess();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(1000, 300);
        textFieldFrame.setVisible(true);
    }
}
