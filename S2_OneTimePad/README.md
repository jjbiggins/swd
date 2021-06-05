# S2_OneTimePad


## Problem Statement
This program sought to encrypt a message. Its consisted of one main class, Cypher. The program read in an input message as well as a input integer. The integer was used to both encrypt and decrypt the message.

## Developer Documentation
The program's main class, Cypher, had a two argument constructor. It took in a message and integer. The class had a method that was used to encrypt the message using the integer value as a key; It also had a decrypt method; that, again, took advantage of the key to accomplish its task. Both of these methods utilized the indexToLetter() and letterToIndex() methods. These methods returned a char or int value respectively. 

![UML Diagram](https://raw.githubusercontent.com/jjbiggins/S2_OneTimePad/master/doc/Cypher.png)

[JavaDocs](http://localhost:8000/jjbiggins_swd/oral_exam1/S2_OneTimePad/doc/index.html)

## User Documentation
Once running, the user will be prompt to enter in a message. They will then be prompt to enter in an integer value. The program will then output the scrambled, encrypted, word and the unscrambled, decrypted, word to the console.

## Source Code 

[Source Code](https://class-git.engineering.uiowa.edu/swd2017/jjbiggins_swd/tree/master/oral_exam1/S2_OneTimePad/src)

