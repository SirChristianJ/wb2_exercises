package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        int serialNumber1 = promptUserForInt("What is the serial number? ");
        String modelName1 = promptUserForString("What model is the phone? ");
        String carrierName1 = promptUserForString("Who is the carrier? " );
        String phoneNumberInput1 = promptUserForString("What is the phone number? ");
        String ownerName1 = promptUserForString("Who is the owner of the phone? ");

        cellPhone1.setSerialNumber(serialNumber1);
        cellPhone1.setModel(modelName1);
        cellPhone1.setCarrier(carrierName1);
        cellPhone1.setPhoneNumber(phoneNumberInput1);
        cellPhone1.setOwner(ownerName1);

        int serialNumber2 = promptUserForInt("What is the serial number? ");
        String modelName2 = promptUserForString("What model is the phone? ");
        String carrierName2 = promptUserForString("Who is the carrier? " );
        String phoneNumberInput2 = promptUserForString("What is the phone number? ");
        String ownerName2 = promptUserForString("Who is the owner of the phone? ");

        cellPhone2.setSerialNumber(serialNumber2);
        cellPhone2.setModel(modelName2);
        cellPhone2.setCarrier(carrierName2);
        cellPhone2.setPhoneNumber(phoneNumberInput2);
        cellPhone2.setOwner(ownerName2);

        System.out.println("Owner 1");
        display(cellPhone1);
        System.out.println("Owner 2");
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

    }

    public static String promptUserForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static int promptUserForInt(String prompt){
        System.out.print(prompt);
        int userInt = scanner.nextInt();
        scanner.nextLine();
        return userInt;
    }

    public static void display(CellPhone phone){
        int newSerialNumber = phone.getSerialNumber();
        String newModelName = phone.getModel();
        String newCarrierName = phone.getCarrier();
        String newPhoneNumberInput = phone.getPhoneNumber();
        String newOwnerName = phone.getOwner();

        System.out.printf("\nSerial Number: %d", newSerialNumber);
        System.out.printf("\nModel Name: %s", newModelName);
        System.out.printf("\nCarrier Name: %s", newCarrierName);
        System.out.printf("\nPhone Number: %s", newPhoneNumberInput);
        System.out.printf("\nOwner: %s\n\n", newOwnerName);
    }

}