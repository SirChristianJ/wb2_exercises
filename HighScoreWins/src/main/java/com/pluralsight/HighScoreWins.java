package com.pluralsight;
import java.util.*;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String response = promptUser("Please enter a game score in the following format (Home:Visitor|21:9): ");
        parsePrompt(response);
    }

    public static String promptUser(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static void parsePrompt(String prompt){
        String teamName = prompt.substring(0,prompt.indexOf("|"));
        String teamScore = prompt.substring(prompt.indexOf("|") + 1);
        String teamName1 = teamName.substring(0,teamName.indexOf(":"));
        String teamName2 = teamName.substring(teamName.indexOf(":")+1);
        String firstTeamScore = teamScore.substring(0,teamScore.indexOf(":"));
        String secondTeamScore = teamScore.substring(teamScore.indexOf(":")+1);
        int teamScore1 = Integer.parseInt(firstTeamScore);
        int teamScore2 = Integer.parseInt(secondTeamScore);

        System.out.println("Winner: " + ((teamScore1 > teamScore2) ? teamName1 : teamName2));

    }
}