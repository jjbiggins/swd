import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SixCardGolfClient extends JFrame implements Runnable {


    private JTextField idField;
    private JTextArea displayArea;
    private JPanel boardPanel;
    private JPanel panel2;
    private GameManager game;
    private Card[][] players1Cards;
    private Card[][] player2Cards;
    private Card currentCard;
    private Socket connection;
    private Scanner input;
    private Formatter output;
    private String sixCardGolfHost;
    private boolean myTurn;

    public SixCardGolfClient(String host) {
        sixCardGolfHost = host;
        displayArea = new JTextArea(4, 30); // set up JTextArea
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.SOUTH);

        boardPanel = new JPanel(); // set up panel for squares in board
        boardPanel.setLayout(new GridLayout(3, 3, 0, 0));

        players1Cards = new Card[2][3];
        player2Cards = new Card[2][3];

        for (int row = 0; row < players1Cards.length; row++) {

            for (int column = 0; column < players1Cards[row].length; column++) {

            }
        }

        idField = new JTextField();
        idField.setEditable(false);
        add(idField, BorderLayout.NORTH);

        panel2 = new JPanel();
        panel2.add(boardPanel, BorderLayout.CENTER);
        add(panel2, BorderLayout.CENTER);

        setSize(300, 225);
        setVisible(true);

        startClient();
    }


    public void startClient() {
        try {

            connection = new Socket(
                    InetAddress.getByName(sixCardGolfHost), 12345);


            input = new Scanner(connection.getInputStream());
            output = new Formatter(connection.getOutputStream());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        ExecutorService worker = Executors.newFixedThreadPool(1);
        worker.execute(this); // execute client
    }


    public void run() {


        while (true) {
            if (input.hasNextLine())
                processMessage(input.nextLine());
        }
    }


    private void processMessage(String message) {

        if (message.equals("Valid move.")) {
            displayMessage("Valid move, please wait.\n");
        } else if (message.equals("Invalid move, try again")) {
            displayMessage(message + "\n");
            myTurn = true;
        } else if (message.equals("Opponent moved")) {
            int location = input.nextInt();
            input.nextLine();
            int row = location / 3;
            int column = location % 3;


            displayMessage("Opponent moved. Your turn.\n");
            myTurn = true;
        } else
            displayMessage(message + "\n");
    }

    // manipulate displayArea in event-dispatch thread
    private void displayMessage(final String messageToDisplay) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        displayArea.append(messageToDisplay);
                    }
                }
        );
    }


}