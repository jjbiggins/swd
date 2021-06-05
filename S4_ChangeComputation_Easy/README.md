# S4_ChangeComputation_Easy

## Problem Statement
Write a program to return the told change for a customer given the value of an item and the amount paid by the customer. Furthermore, the program sought to determine the necessary amount of certain currencies (i.e.$20 bills, $10 bills, quarters,etc.) to return to the customer to sum to the total change. The program, using random integers, assigned a number to the quantity of each individual type of currency in the cash register (i.e. cash register object). This determined the amount of each type of currency was possible to be returned.

## Developer Documentation
The program consists of two main classes, Change and CashRegister. The class Change has a three-argument constructor; it then instantiates changeAmount by taking the first argument, the total price of the item to be purchases, and subtracting it from second argument, the total amount the customer paid. The third argument is a CashRegister object. This class also has a getChange() method that returns the total amount of change to be returned to the customer; prior to that, it also rounds the value to the the tenth's place. Additionally, the Change class has a public void method called billsAndCoinsToReturn(), which takes in a single argument, the CashResgister object.This method determines the number of each type of currency should be returned to make the appropriate change based off the contents of the cash register. Having said that, the CashRegister class has a eight-argument constructor; each argument represents the quantity of each currency in the cash register. It then has getter and setter methods for all eight currencies. 

![UML Diagram](https://raw.githubusercontent.com/jjbiggins/S4_ChangeComputation/master/doc/ChangeComputationDiagram.png)

[JavaDocs](http://localhost:8000/jjbiggins_swd/oral_exam1/S4_ChangeComputation/doc/)



## User Documentation
When the program runs, the user will be prompted to input a value for both the price of the item to be purchased and the amount the customer paid into the console. The program will then print out the results to the console; the results will contain the following: the total change to be returned and the number of each type of currency necessary to make the change.


## Source Code
[S4_ChangeComputation](https://class-git.engineering.uiowa.edu/swd2017/jjbiggins_swd/tree/master/oral_exam1/S4_ChangeComputation_Medium/src)
