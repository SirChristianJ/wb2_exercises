package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = promptUser("Please enter your full name: ");
        String userDate = promptUser("What date will you be arriving? (MM/dd/yyyy): ");
        String validatedDate = checkDate(userDate);
        validatedDate = formatDate(validatedDate);
        String numberOfTickets = promptUser("How many tickets will you like? ");
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("M-dd-yyyy");
        LocalDate date = LocalDate.parse(validatedDate, formatter);


        System.out.println((numberOfTickets.equals("1") ? numberOfTickets + " ticket ": numberOfTickets + " tickets ") + "reserved for " + date + " under " + formatPrompt(fullName));
    }

    public static String promptUser(String prompt){
        System.out.println(prompt);

        return scanner.nextLine().trim();
    }

    public static String formatPrompt(String userName){
        String firstName = userName.substring(0,userName.indexOf(" "));
        String lastName = userName.substring(userName.indexOf(" ") + 1);

        return lastName + ", " + firstName;
    }

    public static String formatDate(String userDate){
        return userDate.replace('/','-');
    }

    public static String checkDate(String userDate){
        while(!userDate.contains("/")){
            System.out.println("Please enter date in correct format! (MM/dd/yyyy)");
            userDate = promptUser("What date will you be arriving? (MM/dd/yyyy): ");
        }
        return userDate;
    }

}