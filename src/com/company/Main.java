package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String pluralize(String string, int count) {
        if (count == 1) {
            return string;
        } else {
            return string + "s";
        }
    }

    public static void flipNHeads(int headsInRow) {
        int flipCounter = 0, headsCounter = 0;
        double coin;
        Random random = new Random();
        while (headsCounter < headsInRow) {
            coin = random.nextDouble();
            if (coin < 0.5) {
                System.out.println("tail");
                headsCounter = 0;
            } else {
                System.out.println("head");

                headsCounter = headsCounter + 1;
            }
            flipCounter = flipCounter + 1;

        }

        System.out.println("It took " + flipCounter + " flips to flip " + headsCounter + " heads");

    }

    public static void clock() {

        int currentSecond = 0;

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (currentSecond != second) {
                System.out.println(time);
                currentSecond = second;
            }
        }

    }

//    Rolling Dice method
    public static ArrayList roll(int n) {

        Random random = new Random();
        int randomNum;
        ArrayList<Integer> dice = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            randomNum = random.nextInt(6) + 1;
            dice.add(randomNum);
        }
        return dice;
    }

//    Contains Duplicates method
    public static boolean containsDuplicates(int[] array) {

        boolean condition = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                i++;
                if (i == array.length) {
                    break;
                }
                if (array[j] == array[i]) {
                    condition = true;

                }

            }
        }
        return condition;

    }

//    Calculating Averages method
    public static double Averages(int array[]) {

        double sum = 0.0 ;
        double avg;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        avg = sum / array.length;
        return avg;
    }

//    Lowest average of arrays
    public static int[] lowestAverageOfArrays(int arrays[][]) {

        int sum1 = 0, sum2 = 0;
        double avg1 = 0.00, avg2 = 0.00;
        int minAvgArray [] = arrays[0];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum1 = sum1 + arrays[i][j];
                avg1 = sum1 / arrays[i].length;
            }
        }
        for (int i = 1; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum2 = sum2 + arrays[i][j];
                avg2 = sum2 / arrays[i].length;
            }
            if (avg2 < avg1) {
                avg1 = avg2;
                minAvgArray = arrays[i];
            }
            sum2 = 0;
        }
        return minAvgArray;
    }


    public static void main(String[] args) {
        // write your code here
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

       flipNHeads(5);

       clock();


//        CALL AND PRINT Rolling Dice METHOD

        System.out.println(roll(5));


        int array1[] = {5, 5, 4, 3, 2};
        int array2[] = {6, 7, 8, 9, 10, 11};
//        CALL AND PRINT Contains Duplicates METHODS
        System.out.println("CALL AND PRINT Contains Duplicates METHODS");
        System.out.println("Is it contains duplicates value? ---> " + containsDuplicates(array1));
        System.out.println("Is it contains duplicates value? ---> " + containsDuplicates(array2));
        System.out.println();

//        CALL AND PRINT AVERAGE METHODS
        System.out.println("CALL AND PRINT AVERAGE METHODS");
        System.out.println("The average of array is: " + Averages(array1));
        System.out.println("The average of array is: " + Averages(array2));
        System.out.println();

//        CALL AND PRINT LOWEST AVERAGE OF ARRAYS
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };


        int avgArray [] = lowestAverageOfArrays(weeklyMonthTemperatures);

        System.out.println(" CALL AND PRINT LOWEST AVERAGE OF ARRAYS");
        System.out.println("LOWEST AVERAGE OF ARRAYS is: " + Arrays.toString(avgArray));


    }


}

