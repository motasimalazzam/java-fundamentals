package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static String pluralize (String string , int count){
        if(count == 1 ){
            return string;
        }else {
            return string + "s";
        }
        }

   public static void flipNHeads (int headsInRow){
        int flipCounter = 0, headsCounter = 0;
        double coin ;
        Random random = new Random();
        while (headsCounter < headsInRow){
            coin = random.nextDouble();
            if(coin < 0.5){
                System.out.println("tail");
                headsCounter =0;
            }else{
                System.out.println("head");

                headsCounter = headsCounter + 1;
            }
            flipCounter = flipCounter + 1;

        }

       System.out.println("It took " + flipCounter + " flips to flip " + headsCounter +" heads");

   }

   public static void clock(){

        int currentSecond = 0;

        while (true){
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (currentSecond != second){
                System.out.println(time);
                currentSecond = second;
            }
            }

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



    }


}

