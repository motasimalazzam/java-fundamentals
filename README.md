# Java-Fundamentals

## Architecture

The programing language used to build this project is Java.

**Author**: Motasim Al-Azzam

## Lab-01: Java Primitives and Control Flow

### Overview

This project is dedicated to practicing Java fundamentals.

### Methods 

* **pluralize(String string, int count)**:  This method accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

* **flipNHeads(int headsInRow)**: This method accepts an *integer n* and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers **below .5** are considered **tails**. Numbers at and **above .5** are considered **heads**.

* **clock()**:  This method uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with **CTRL-C** or presses the**stop** button in their IDE.

## Lab-02: Arrays, for loops and ArrayLists

### Overview

This lab is dedicated to creating, interacting with and manipulating arrays in Java.

### Methods 

* **roll(int n)**: This method accepts an **integer `n`** and rolls a six-sided dice `n` times and it returns an **ArrayList** containing the values of the rolls.

* **containsDuplicates(int[] array)**: This method accepts an **integer array** and it returns `true` or `false` depending on whether the array contains duplicate values.

*  **Averages(int array[])**: This method accepts an **integer array** and calculates and returns the average of all the values in the array.

* **lowestAverageOfArrays(int arrays[][])**: This method accepts an **int array of arrays** and  calculate the average value for each array and return the array with the lowest average.

## Lab-03: Maps and File I/O

### Overview

In this lab I worked in two directory. The first one is the basiclibrary that still practice on the arrays. The second directory is linter directory that dedicated to how to deal and read a JavaScript file.

### Methods

1. **Basiclibrary directory**:

*  **weatherData(int[][] weeklyMonthTemperatures)**: This method accepts an **int array of arrays** and iterate through all of the data to find the min and max values. And Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month and return that String.

* **tally(`List<String> votes`)**: This method accepts a **List of Strings representing votes** and returns one string to show what got the most votes.

2. **Linter directory**:

* **linterMessage (String path)**: This method accepts a **String path**. the path is the path of the javaScript file. The parpouse of this method is generates an error message whenever it finds a line that doesn’t end in a semi-colon.
