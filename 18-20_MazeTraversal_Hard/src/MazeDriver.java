import javax.swing.*;

public class MazeDriver {
    public static void main(String[] args) {

        char[][] maze = {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#',},
                {'#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#'},
                {'.', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#'},
                {'#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#'},
                {'#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '.'},
                {'#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
                {'#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
                {'#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
                {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#'},
                {'#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#'},
                {'#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

        char startingPosition = maze[2][0];
        int rowNumber = 2;
        int columnNumber = 0;

        Maze mazeDisplay = new Maze(maze, rowNumber, columnNumber);
        mazeDisplay.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mazeDisplay.setSize(750, 750);
        mazeDisplay.setVisible(true);

        mazeDisplay.mazeTraversal(maze, rowNumber, columnNumber);
    }
}
