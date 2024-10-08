package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] testScores = new double[10];

        System.out.println("Test Scores: ");
        for (int i = 0; i < testScores.length;i++){
            testScores[i] = (Math.random() * 100) + 1;
            System.out.printf("%.2f %s", testScores[i], " ");
        }

        System.out.println();
        averageTestScore(testScores);
        highTestScore(testScores);
        lowTestScore(testScores);
        medianTestScore(testScores);
    }

    public static void averageTestScore(double[] scores){
        double runningSum = 0;

        for(double score: scores){
            runningSum+=score;
        }

        System.out.printf("%s %.2f","\nAverage Test Score:", runningSum/scores.length);
    }

    public static void highTestScore(double[] scores){
        double ans = 0.0;

        for (int i = 0; i < scores.length; i++){
            if(ans < scores[i]){
                ans = scores[i];
            }
        }
        System.out.printf("%s %.2f","\nHighest Test Score:", ans);
    }

    public static void lowTestScore(double[] scores){
        double ans = scores[0];

        for (int i = 1; i < scores.length; i++){
            if(ans > scores[i]){
                ans = scores[i];
            }
        }
        System.out.printf("%s %.2f","\nLowest Test Score:", ans);
    }

    public static void medianTestScore(double[] scores){
        double ans = 0.0;
        int length = scores.length;
        Arrays.sort(scores);
        boolean isEven = length % 2 == 0;
        for (int i = 0; i < length; i++) {
            if (isEven) {
                ans = (scores[length/2 - 1] + scores[length/2]) / 2;
            }
        }
        System.out.printf("%s %.2f","\nMedian Test Score:", ans);
    }
}