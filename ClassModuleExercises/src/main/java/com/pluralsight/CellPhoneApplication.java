package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(9523517,"Google Pixel 7", "AT&T","347-433-4455","George");

        System.out.println("Enter info for cellphone 1:");
        setPhoneInfo(cellPhone1);
        System.out.println("Enter info for cellphone 2:");
        setPhoneInfo(cellPhone2);

        System.out.println("Owner 1");
        display(cellPhone1);
        System.out.println("Owner 2");
        display(cellPhone2);
        System.out.println("Owner 3");
        display(cellPhone3);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone3.dial(cellPhone2.getPhoneNumber());
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

    public static CellPhone setPhoneInfo(CellPhone cellPhone){
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

        return cellPhone;
    }

}