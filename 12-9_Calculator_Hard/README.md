# 12-9_Calculator_Hard

## Problem Statement
To design the software and implement the necessary code to create an operational calculator GUI. The calculator sought to implement basic binary operations (i.e. multiplication, addition, ect.); furthermore, we sought to provide the calculator with the ability to apply these binary operations successively.

## Developer Documentation
The program consists of three main classes, a driver class, and a FXML file. The first class, CalculatorModel, served as the back bone for the calculator's functionality.It implemented the default constructor, and had two private members, one for each of the numbers the given binary operation was to be performed on; in addition, it had getter and setter methods for each of the private members and a calculate method. This method took in a string as the argument. The string was used to represent the binary operation that was to be performed. Once the binary operation was performed, this number was then saved in the first private member, this allowed for successive operations to be performed. Another class, CalculatorController, controlled the actions of the GUI. It had also implemented the default constructor. This class had five private members, a CalculatorModel object, a double to display to represent the result, a Text object for the output text to be displayed to the user, a string to represent the operator, and a boolean that was used to determine. Furthermore, this class contained two methods: processNumPad and processOperation, which both took in an ActionEvent object as an argument. Intuitively, processNumPad was invoked when the a button on the number pad was clicked, and processOperation was invoked when a binary operation button was clicked. processNumPad would set the text of the GUI to represent the current number, processOperation would call upon the methods of CalculateModel and then set the text as its result. It was displayed by altering the FXML which was created using JavaFX screen builder. 

![UML Diagram](https://raw.githubusercontent.com/jjbiggins/12-9_Calculator_Hard/master/doc/UML%20Diagram.png)

## Java Docs
[Java Docs](http://localhost:8000/jjbiggins_swd/oral_exam2/12-9_Calculator_Hard/doc/)

## User Documentation
When the program begins running, the calculator GUI will then appear in the screen. The user will then input a number followed by a binary operator and another number. The GUI will display the first number; then, upon hitting the second, it will display the proper value based on the binary operation chosen. If the user was to hit another binary operation, this would be performed on the number last displayed and a number to be clicked on.

## Source Code
[Source Code](https://class-git.engineering.uiowa.edu/swd2017/jjbiggins_swd/tree/master/oral_exam2/12-9_Calculator_Hard/src)
