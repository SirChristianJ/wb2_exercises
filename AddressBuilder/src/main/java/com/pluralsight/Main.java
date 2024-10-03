package com.pluralsight;
import java.util.*;

public class Main {
    static StringBuilder address = new StringBuilder();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        address.append(promptUser("Full name: "));
        System.out.println();
        address.append("\n");
        address.append("\n");
        address.append("Billing Address:\n");
        address.append(promptUser("Billing Street: "));
        address.append("\n");
        address.append(addressFormatter(promptUser("Billing City:"),promptUser("Billing State: "), promptUser("Billing Zip: ")));
        address.append("\n");
        System.out.println();
        address.append("\n");
        address.append("Shipping Address:\n");
        address.append(promptUser("Shipping Street: "));
        address.append("\n");
        address.append(addressFormatter(promptUser("Shipping City: "),promptUser("Shipping State: "),promptUser("Shipping Zip: ") ));
        address.append("\n");

        String finalAddress = address.toString();
        System.out.println("\n" + finalAddress);
    }

    public static String promptUser(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static String addressFormatter(String city, String state, String zip){
        return city + ", " + state + " " + zip;
    }

}