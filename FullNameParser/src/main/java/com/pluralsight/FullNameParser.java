package com.pluralsight;
import java.util.*;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = promptUser("Please enter your full name: ");
        stringParser(fullName);
    }

    public static String promptUser(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void stringParser(String fName){
        String firstName,lastName,middleName;
        String[] nameSplit = fName.split(" ");

        if(nameSplit.length == 3) {
            firstName = nameSplit[0];
            middleName = nameSplit[1];
            lastName = nameSplit[2];
        }

        else{
            firstName = nameSplit[0];
            middleName = "(none)";
            lastName = nameSplit[1];
        }

        System.out.println("First Name: " + firstName.trim());
        System.out.println("Middle Name: " + middleName.trim());
        System.out.println("Last Name: " + lastName.trim());

    }
}