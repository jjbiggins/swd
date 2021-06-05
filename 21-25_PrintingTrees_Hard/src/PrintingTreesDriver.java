
import javax.swing.*;
import java.security.SecureRandom;

public class PrintingTreesDriver extends JFrame{
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("Inserting the following values: ");

        // insert 10 random integers from 0-99 in tree
        for (int i = 1; i <= 10; i++) {
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        System.out.printf("%n%nOutput Tree traversal%n");
        tree.outputTree();
        System.out.println();


        TreeGUI display = new TreeGUI(tree);
        display.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        display.setSize(510, 510);
        display.setVisible(true);
    }
}
