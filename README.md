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


## Lab-06: Inheritance and Interfaces

### Overview

In this lab I created classes and interfaces to represent reviews of restaurants. **Restaurant** class for create a resturant and **Review** class to add a review for a restaurant.

### Methods

1.  **Restaurant Class**: The Constructor of Restaurant class acept three variables:
   
    * `String name`: For the restaurant name.
    * `double numberOfStars`: For the rate of the restaurant between *0* and *5*.
    * `String  priceCategory`: For a price category.

* `getReviews()`: The Type of this method is  `LinkedList<Review>` and it is for store the all reviews in the list.

* `getName()`: This method is the Override method from the *RestaurantInterface*, and its purpose to get the name of the restaurant and return a `String` type.

* `getNumberOfStars()`: This method is the Override method from the *RestaurantInterface*, and its purpose to get the stars of the restaurant and return a `double` type.

* `getPriceCategory()`: This method is the Override method from the *RestaurantInterface*, and its purpose to get the price category and return a `String` type.

* `addReview(Review review)`: This method is the Override method from the *RestaurantInterface*, and it accepts a `Review` variable type. Its purpose to add the review in the list of reviews. Also insude this method I call the `updateStars()`.

* `updateStars()`: The purpose of this method is to update the rate of the restaurant (depend on the stars from reviews) by calculating the average of stars.

* `toString()`: To print the restaurant data like this statment: **Restaurant{name='kfc', numberOfStars=2.0, priceCategory=$}**

2. **Review Class**: The Constructor of Review class acept three variables:
   
    * `String body`: For writing the review.
    * `String author`: For the person name who writing the review.
    * `double stars`: For rating the restaurant from the person.

* `getStars()`: This method is the Override method from the *ReviewInterface*, and its purpose to return the stars from the review which person was choosing.

* `getAuthor()`: This method is the Override method from the *ReviewInterface*, and its purpose to return the person name.

* `getBody()`: This method is the Override method from the *ReviewInterface*, and its purpose to return the text of the review.

* `toString()`: To print the Review data like this statment: **Review{body='Good restaurant', author='Meghem', stars=3.0}**

## Lab-07: Inheritance, day 2

### Overview

In this lab I added a two new class the first one is **Shop** class and the second one is **Theater** class.

### Methods

1. **Shop Class**: The Constructor of Shop class acept three variables:

    * `String name`: For the shop name.
    * `String description`: For store a description about the shop.
    * `int numOfDollarSigns`: For store the number of DollarSigns.

* `getReviews()`: The Type of this method is  `LinkedList<Review>` and it is for store the all reviews in the list.

* `getName()`: This method is the Override method from the *ShopInterface*, and its purpose to get the name of the shop and return a `String` type.

* `getDescription()`: This method is the Override method from the *ShopInterface*, and its purpose to get the shop description and return a `String` type.

* `getNumOfDollarSign()`: This method is the Override method from the *ShopInterface*, and its purpose to get the number of dollar signs and return an `int` type.

* `addReview(Review review)`: This method is the Override method from the *ShopInterface*, and it accepts a `Review` variable type. Its purpose to add the review in the list of reviews. Also insude this method I call the `updateStars()`.

* `updateStars()`: The purpose of this method is to update the number of dollar signs (depend on the stars from reviews) by calculating the average of stars.

* `toString()`: To print the Shop data like this statment: **Shop{name='carrefour', description='supermarket', numOfDollarSigns=3}**

2. **Theater Class**: The Constructor of Theater class acept one variable:

    * `String name`: For the theater name.

* `getReviews()`: This method to store the all reviews in the map.

* `getName()`: This method is the Override method from the *TheaterInterface*, and its purpose to get the name of the Theater and return a `String` type.

* `addNewRev(String body, String author, int stars)`: This method accept two `String` value for *body* and *author* and an `int` value for *stars*. This method to creat a review and store the review in the map of reviews.

* `addNewRev(Review rev, String movieName)`: This method accept `Review` value for the review and `String` value for the movie name. This method check if the movie is existing in the list of movies or not. If is existing, you can write a review about it.

* `addMovie(String movieTitle)`: This method accept `String` value for movie title. Its purpose to add any movie you want in the movies list.

* `getMovies()`: This method to store the all mvies in the movies list.

* `removeMovie(String movieTitle)`: This method accept `String` value for movie title. Its purpose to remove any movie you want in the movies list.
