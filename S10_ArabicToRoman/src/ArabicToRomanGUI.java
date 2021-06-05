import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ArabicToRomanGUI extends JFrame {

    private JTextField arabicNumerals;
    private JTextField romanNumerals;
    private String currentRomanNumeralsEntered;
    private String currentArabicNumeralsEntered;
    private String currentKeyPressed;
    private ArabicToRomanConverter convertArabicToRoman;
    private RomanToArabicConverter convertRomanToArabic;


    public ArabicToRomanGUI() {
        super("Arabic to Roman Numerals ArabicToRomanConverter");
        setLayout(new FlowLayout());

        currentArabicNumeralsEntered = "";
        currentRomanNumeralsEntered = "";
        convertArabicToRoman = new ArabicToRomanConverter(0);
        convertRomanToArabic = new RomanToArabicConverter("");

        JLabel arabicNumeralsLabel = new JLabel("Arabic Numerals: ");
        arabicNumeralsLabel.setFont(new Font("Courier New", Font.PLAIN, 30));
        add(arabicNumeralsLabel);

        arabicNumerals = new JTextField(20);
        arabicNumerals.setFont(new Font("Courier", Font.PLAIN, 20));
        add(arabicNumerals);

        JLabel romanNumeralsLabel = new JLabel("Roman Numerals: ");
        romanNumeralsLabel.setFont(new Font("Courier New", Font.PLAIN, 30));
        add(romanNumeralsLabel);

        romanNumerals = new JTextField(20);
        romanNumerals.setFont(new Font("Courier", Font.PLAIN, 20));
        add(romanNumerals);

        KeyEventHandler KeyHandler = new KeyEventHandler();
        arabicNumerals.addKeyListener(KeyHandler);
        romanNumerals.addKeyListener(KeyHandler);
    }

    private class KeyEventHandler implements KeyListener {


        @Override
        public void keyPressed(KeyEvent event){
            currentKeyPressed = KeyEvent.getKeyText(event.getKeyCode());
            if (event.getSource() == arabicNumerals) {
                if(currentKeyPressed == "Backspace"){
                    int newArabicValue = Integer.parseInt(currentArabicNumeralsEntered) / 10;
                    currentArabicNumeralsEntered = "" + newArabicValue;
                }
                else{
                    currentArabicNumeralsEntered = currentArabicNumeralsEntered + currentKeyPressed;
                }
                convertArabicToRoman = new ArabicToRomanConverter(Integer.parseInt(currentArabicNumeralsEntered));
                romanNumerals.setText(convertArabicToRoman.getNumberInRomanNumerals());
            }
            else if (event.getSource() == romanNumerals) {
                if(currentKeyPressed == "Backspace"){
                    char[] currentRomanNumeralsArray = convertRomanToArabic.getUserRomanNumerals();
                    String newRomanNumerals = "";
                    for(int i = 0; i < currentRomanNumeralsArray.length -1; i++){
                        newRomanNumerals = "" + currentRomanNumeralsArray[i];
                    }
                    currentRomanNumeralsEntered = newRomanNumerals;
                }
                else{
                    currentRomanNumeralsEntered = currentRomanNumeralsEntered + currentKeyPressed;
                }

                convertRomanToArabic = new RomanToArabicConverter(currentRomanNumeralsEntered);
                arabicNumerals.setText("" + convertRomanToArabic.getArabicNumerals());
            }
        }


        @Override
        public void keyReleased(KeyEvent event) {
        }


        @Override
        public void keyTyped(KeyEvent event) {

        }
    }
}
