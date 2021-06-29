package com.basicLibrary;
import java.util.*;
public class Library {
    public static String weatherData() {
        HashSet<Integer> weatherSet = new HashSet<>();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        for (int[] ints : weeklyMonthTemperatures) {
            for (int day : ints) {
                weatherSet.add(day);
            }
        }
        int minTemp = weeklyMonthTemperatures[0][0], maxTemp = weeklyMonthTemperatures[0][0];
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                if (weeklyMonthTemperatures[i][j] >= maxTemp) {
                    maxTemp = weeklyMonthTemperatures[i][j];
                }
                if (weeklyMonthTemperatures[i][j] <= minTemp) {
                    minTemp = weeklyMonthTemperatures[i][j];
                }
            }
        }
        System.out.println("High= " + maxTemp);
        System.out.println("Low= " + minTemp);
        for (int i = minTemp; i < maxTemp; i++) {
            if (!weatherSet.contains(i))
                System.out.println( "Never saw temperature: " + i);
        }
        return " ";
    }
    public static String tally(List<String> votes) {
        HashSet<String> votedItems = new HashSet<>();
        votedItems.addAll(votes);
        int numVotes = 0;
        String winner = null;
        for (String item : votedItems) {
            int count = Collections.frequency(votes, item);
            if (numVotes < count) {
                numVotes = count;
                winner = String.format("%s received the most votes!", item);
            } else if (numVotes == count) {
                winner = "Tie for the winner, a re-vote is needed";
            }
        }
        return winner;
    }
    public static void main(String[] args) {
        System.out.println(weatherData());
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }
}