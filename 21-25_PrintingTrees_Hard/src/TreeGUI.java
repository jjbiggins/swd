import javax.swing.*;
import java.awt.*;

public class TreeGUI extends JFrame {

    private JTextArea printedTree;

    public TreeGUI(Tree<Integer> tree){
        super("Binary Tree");
        setLayout(new FlowLayout());

        printedTree = new JTextArea(5, 20);
        printedTree.setFont(new Font("Courier", Font.PLAIN, 20));
        printedTree.setText(tree.getTree());
        add(printedTree);
    }
}

