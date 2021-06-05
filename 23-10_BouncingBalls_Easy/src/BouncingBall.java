import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class BouncingBall extends JFrame{

    private DisplayPanel display;

    public BouncingBall() {
        display = new DisplayPanel();
        display.setPreferredSize(new Dimension(640, 480));


        display.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        BallSpeedAndDirection motion = new BallSpeedAndDirection(display, 15,
                                                                                 display.getxCoordinate(), display.getyCoordinate(),
                                                                                display.getBallSpeedX(), display.getBallSpeedY());
                        motion.execute();
                    }
                }
        );

        setContentPane(display);
        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        BouncingBall application = new BouncingBall();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



    public class DisplayPanel extends JPanel{

        private float ballRadius = 15;
        private float xCoordinate = ballRadius + 50;
        private float yCoordinate = ballRadius + 20;
        private int ballSpeedX = 3;
        private int ballSpeedY = 2;

        public DisplayPanel(){
            setPreferredSize(new Dimension(640, 480));
        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.fillRect(0, 0, 635, 575);
            g.setColor(Color.LIGHT_GRAY);

            g.fillOval((int) (xCoordinate - ballRadius), (int) (yCoordinate - ballRadius), 30, 30);
            g.setColor(Color.BLUE);
        }

        public float getxCoordinate() {
            return xCoordinate;
        }

        public void setxCoordinate(float xCoordinate) {
            this.xCoordinate = xCoordinate;
        }

        public float getyCoordinate() {
            return yCoordinate;
        }

        public void setyCoordinate(float yCoordinate) {
            this.yCoordinate = yCoordinate;
        }

        public int getBallSpeedX() {
            return ballSpeedX;
        }

        public void setBallSpeedX(int ballSpeedX) {
            this.ballSpeedX = ballSpeedX;
        }

        public int getBallSpeedY() {
            return ballSpeedY;
        }

        public void setBallSpeedY(int ballSpeedY) {
            this.ballSpeedY = ballSpeedY;
        }
    }
}