# 18-20_MazeTraversal_Hard

## Problem Statement

In this problem, we sought to create a recursive method to solve a maze. It was to determine, possible paths and move to those spots. While it moved, it would mark its movement with an 'x'. If it determined one path was a dead end, it was to go back; while it went back, it would turn the 'x' into an 'o'. It did this until it completed the maze. At that point, a "YOU WIN" was displayed.

## Developer Documentation
This program contained one main class called Maze. It had a three argument constructor that took in a two-dimensional character array and the coordinates of the starting position, which was represented by one argument for the row number and one for the column number. This class had one method called mazeTraversal. It would determine if a move could be made in any direction. It would then change the coordinates and the text to be displayed; then, it would recursively call the function. This would occur until the maze was solved.

![UML Diagram](https://raw.githubusercontent.com/jjbiggins/18-20_MazeTraversal_Hard/master/doc/Maze.png)

## Java Docs
[Java Docs](http://localhost:8000/jjbiggins_swd/oral_exam2/18-20_MazeTraversal_Hard/doc/)

## User Documentation
The program would run and display the solved maze on both the console and a GUI for the user.

## Source Code
[Source Code](https://class-git.engineering.uiowa.edu/swd2017/jjbiggins_swd/tree/master/oral_exam2/18-20_MazeTraversal_Hard/src)
