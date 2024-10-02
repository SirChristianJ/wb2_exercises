package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName = promptUser("First Name: ");
        String middleName = promptUser("Middle Name: ");
        String lastName = promptUser("Last Name: ");
        String suffix = promptUser("Suffix: ");
        System.out.print("Full name: " + displayName(firstName,middleName,lastName,suffix));
    }

    public static String promptUser(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static String displayName(String fName, String mName, String lName, String suffixName){
        String fullName = fName + ((mName.isEmpty()) ? "": " " + mName)+ " " + lName + ((suffixName.isEmpty()) ? "":", " + suffixName);

        return fullName;
    }

}