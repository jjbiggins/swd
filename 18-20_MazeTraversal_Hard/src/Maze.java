import javax.swing.*;
import java.awt.*;

public class Maze extends JFrame{

    private char[][] maze;
    private int rowNumber;
    private int columnNumber;

    private JTextArea mazePicture;
    private JTextField message;
    private String displayText;


    public Maze(char[][] maze, int rowNumber, int columnNumber){
        super("Maze");
        setLayout(new FlowLayout());


        mazePicture = new JTextArea(5, 20);
        mazePicture.setFont(new Font("Courier", Font.PLAIN, 20));
        mazePicture.setText(displayText);
        add(mazePicture);

        message = new JTextField(8);
        message.setFont(new Font("Courier", Font.PLAIN, 20));
        message.setText("YOU WIN");
        add(message);
        message.setVisible(false);

        this.maze = maze;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        maze[rowNumber][columnNumber] = 'x';

    }


    public void mazeTraversal(char[][] maze, int rowNumber, int columnNumber) {

        displayText = "";
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                if (maze[row][col] == '.') {
                    displayText = displayText + maze[row][col] + "     ";
                } else {
                    displayText = displayText + maze[row][col] + "    ";
                }
            }
            displayText += "\n";
            displayText += "\n";
        }
        mazePicture.setText(displayText);

        if(columnNumber == 11){
            message.setVisible(true);
        }
        else if (maze[rowNumber + 1][columnNumber] == '.') {
            rowNumber++;
            maze[rowNumber][columnNumber] = 'x';
            mazeTraversal(maze, rowNumber, columnNumber);
        }
        else if (maze[rowNumber - 1][columnNumber] == '.') {
            rowNumber--;
            maze[rowNumber][columnNumber] = 'x';
            mazeTraversal(maze, rowNumber, columnNumber);
        }
        else if (maze[rowNumber][columnNumber + 1] == '.') {
            columnNumber++;
            maze[rowNumber][columnNumber] = 'x';
            mazeTraversal(maze, rowNumber, columnNumber);
        }
        else if (maze[rowNumber][columnNumber - 1] == '.') {
            columnNumber--;
            maze[rowNumber][columnNumber] = 'x';
            mazeTraversal(maze, rowNumber, columnNumber);
        }

        else if (maze[rowNumber + 1][columnNumber] == 'x') {
            rowNumber++;
            if (maze[rowNumber][columnNumber - 1] == '.' || maze[rowNumber][columnNumber + 1] == '.') {
                maze[rowNumber][columnNumber] = 'x';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
            else {
                maze[rowNumber - 1][columnNumber] = 'o';
                maze[rowNumber][columnNumber] = 'o';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
        }

        else if (maze[rowNumber - 1][columnNumber] == 'x') {
            rowNumber--;
            if (maze[rowNumber][columnNumber + 1] == '.' || maze[rowNumber][columnNumber - 1] == '.') {
                maze[rowNumber][columnNumber] = 'x';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
            else {
                maze[rowNumber + 1][columnNumber] = 'o';
                maze[rowNumber][columnNumber] = 'o';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
        }

        else if (maze[rowNumber][columnNumber + 1] == 'x') {
            columnNumber++;
            if (maze[rowNumber - 1][columnNumber] == '.' || maze[rowNumber + 1][columnNumber] == '.') {
                maze[rowNumber][columnNumber] = 'x';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
            else {
                maze[rowNumber][columnNumber - 1] = 'o';
                maze[rowNumber][columnNumber] = 'o';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
        }

        else if (maze[rowNumber][columnNumber - 1] == 'x') {
            columnNumber--;
            if (maze[rowNumber + 1][columnNumber] == '.' || maze[rowNumber - 1][columnNumber] == '.') {
                maze[rowNumber][columnNumber] = 'x';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
            else {
                maze[rowNumber][columnNumber + 1] = 'o';
                maze[rowNumber][columnNumber] = 'o';
                mazeTraversal(maze, rowNumber, columnNumber);
            }
        }
    }
}
