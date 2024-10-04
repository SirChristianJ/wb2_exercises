package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        int serialNumber = promptUserForInt("What is the serial number? ");
        String modelName = promptUserForString("What model is the phone? ");
        String carrierName = promptUserForString("Who is the carrier? " );
        String phoneNumberInput = promptUserForString("What is the phone number? ");
        String ownerName = promptUserForString("Who is the owner of the phone? ");

        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(modelName);
        cellPhone.setCarrier(carrierName);
        cellPhone.setPhoneNumber(phoneNumberInput);
        cellPhone.setOwner(ownerName);

        int newSerialNumber = cellPhone.getSerialNumber();
        String newModelName = cellPhone.getModel();
        String newCarrierName = cellPhone.getCarrier();
        String newPhoneNumberInput = cellPhone.getPhoneNumber();
        String newOwnerName = cellPhone.getOwner();

        System.out.printf("\nSerial Number: %d", newSerialNumber);
        System.out.printf("\nModel Name: %s", newModelName);
        System.out.printf("\nCarrier Name: %s", newCarrierName);
        System.out.printf("\nPhone Number: %s", newPhoneNumberInput);
        System.out.printf("\nOwner: %s", newOwnerName);
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

}