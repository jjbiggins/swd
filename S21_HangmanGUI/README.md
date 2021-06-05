# S21_HangmanGUI

## Problem Statement
In this problem, one sought to write a program to create a GUI in order to allow a user to play hangman. The program was to have a place to enter a word, this was the word the user would the try to guess; however, the word was to be hidden, in some manner, so that the player could not see it. It would then feature text fields(i.e. JTextField objects); one would be designated as the place for the user to enter a letter for their guess. The remaining text fields, would show the following information: number of guesses that remained, the letters incorrectly guessed, the letters correctly guessed, and how many letters in the word remained. The GUI would then alert the user of the outcome of the game, victory of loss.

## Developer Documentation
This program utilized one main class, WordsToGuess, which extends JFrame. The class had a no-argument constructor; in which, it created text fields for each of the necessary elements as well as a password field to hid the word that was to be guesses. Initial, all fields, other than the password field, are hidden not visible to the user. The constructor also instantiates a TextFieldHandler object and invokes the addActionListner() method for password and each of the text fields. Additionally, this class had a private class called TextFieldHandler. This class had a public void method called actionPerformed() that took in an even(i.e. ActionEvent object). It then determined the source of the event, which text field or password field it originated from, and performed the corresponding action.

![UML Diagram](https://raw.githubusercontent.com/jjbiggins/S21_HangmanGUI/master/doc/HangmanDiagram.png)

[JavaDocs](https://localhost:8000/jjbiggins_swd/oral_exam1/S21_HangmanGUI_Hard/doc/index.html)

## User Documentation
The program, when run, opened a GUI which a single text box for entering in the word to be guesses, which was hidden. Once the user hits enter, that password field disappears and the other dialog boxes appear. Here, the user can guess and observe the current status of the game through the information displayed following each guess.

## Source Code
[S21_HangmanGUI](https://class-git.engineering.uiowa.edu/swd2017/jjbiggins_swd/tree/master/oral_exam1/S21_HangmanGUI_Hard/src)
