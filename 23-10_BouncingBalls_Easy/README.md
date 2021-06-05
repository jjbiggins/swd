# 23-10_BouncingBalls_Easy

## Problem Statement
Create a mulithreaded program that display a GUI with a ball. Once the user clicks the window, the ball then bounces around the inside of the GUI window.

## Developer Documentation
There are two main classes, BouncingBalls and BallSpeedAndDirection. BouncingBalls extends JFrame. It has a no argument constructor and nested public class DisplayPanel which extends JPanel. The constructor initializes a DisplayPanel object and creates a mouseClickListener. Thus, when the mouse is first clicked a BallSpeedAndDirection object is create. This class implements SwingWorker. It has a five argument constructor and another method doInBackground. doInBackground, using the private members, calculate the coordinates and ball's speed. It then sets the private members of BouncingBalls to the newly calculated coordinates and speed. Finally, repaint() is called to display a new image.

![UML Diagram](https://raw.githubusercontent.com/jjbiggins/23-10_BouncingBalls_Easy/master/doc/BouncingBall.png)

## Java Docs

[Java Docs](http://localhost:8000/jjbiggins_swd/oral_exam2/23-10_BouncingBalls_Easy/doc/)

## User Documentation
The user first clicks on the JPanel. Once this is done, the ball will bounce around the window of the JPanel until the window is closed by the user.


## Source Code
[23-10_BouncingBalls_Easy](https://class-git.engineering.uiowa.edu/swd2017/jjbiggins_swd/tree/master/oral_exam2/23-10_BouncingBalls_Easy/src)
