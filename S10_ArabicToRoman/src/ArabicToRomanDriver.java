import javax.swing.*;
import java.util.EnumSet;

public class ArabicToRomanDriver {
    public static void main(String args[]){
        ArabicToRomanGUI userInterface = new ArabicToRomanGUI();
        userInterface.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        userInterface.setSize(750, 200);
        userInterface.setVisible(true);
    }
}
