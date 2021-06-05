import javax.swing.*;
import java.awt.*;
import javax.swing.SwingWorker;


public class BallSpeedAndDirection extends SwingWorker<Void, Float[]> {

    private float ballRadius;
    private float xCoordinate;
    private float yCoordinate;
    private float ballSpeedX;
    private float ballSpeedY;
    private BouncingBall.DisplayPanel display;

    public BallSpeedAndDirection(BouncingBall.DisplayPanel display, float ballRadius, float xCoordinate, float yCoordinate, float ballSpeedX, float ballSpeedY) {
        this.ballRadius = ballRadius;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.ballSpeedX = ballSpeedX;
        this.ballSpeedY = ballSpeedY;
        this.display = display;
    }

    public Void doInBackground() {

        while (true) {
                try {
                    Thread.sleep(500/ 30);
                } catch(InterruptedException e) {
                    display.repaint();
                }
                xCoordinate += ballSpeedX;
                yCoordinate += ballSpeedY;
                // Check if the ball moves over the bounds
                // If so, adjust the position and speed.
                if (xCoordinate - ballRadius < 0) {
                    ballSpeedX = -ballSpeedX; // Reflect along normal
                    xCoordinate = ballRadius; // Re-position the ball at the edge
                } else if (xCoordinate + ballRadius > 640) {
                    ballSpeedX = -ballSpeedX;
                    xCoordinate = 640 - ballRadius;
                }
                // May cross both x and y bounds
                if (yCoordinate - ballRadius < 0) {
                    ballSpeedY = -ballSpeedY;
                    yCoordinate = ballRadius;
                } else if (yCoordinate + ballRadius > 480) {
                    ballSpeedY = -ballSpeedY;
                    yCoordinate = 480 - ballRadius;
                }

                display.setxCoordinate(xCoordinate);
                display.setyCoordinate(yCoordinate);
                display.setBallSpeedX((int) ballSpeedX);
                display.setBallSpeedY((int) ballSpeedY);
                display.repaint();

        }
    }

}

