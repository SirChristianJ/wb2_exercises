package com.pluralsight;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static Vehicle[] vehicles;

    public static void main(String[] args) {
        vehicles = initializeVehicleInfo();
        promptUserMenu(vehicles);
    }

    public static void promptUserMenu(Vehicle[] vehicles){
        boolean isActiveSession = true;
        while (isActiveSession){
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5- Add a vehicle");
            System.out.println("6- Quit");

            try{
                int userSelection = scanner.nextInt();
                scanner.nextLine();


                switch (userSelection) {
                    case 1:
                        printAllVehicleInfo(vehicles);
                        break;
                    case 2:
                        searchForVehicle(vehicles);
                        break;
                    case 3:
                        searchForVehicleByPrice(vehicles);
                    case 4:
                        searchForVehicleByColor(vehicles);
                    case 5:
                        addNewVehicle(vehicles);
                        break;
                    case 6:
                        isActiveSession = false;
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Not a valid option, try again!");
                }

            } catch(NullPointerException e){
                System.out.println("\nThere's still space for more vehicles");
            }
        }
    }

    public static Vehicle[] initializeVehicleInfo(){
        Vehicle[] vehicle = new Vehicle[20];
        vehicle[0] = new Vehicle();
        vehicle[0].setVehicleId(101121);
        vehicle[0].setMakeModel("Ford Explorer");
        vehicle[0].setColor("Red");
        vehicle[0].setOdometerReading(45000);
        vehicle[0].setPrice(13500);

        vehicle[1] = new Vehicle();
        vehicle[1].setVehicleId(101122);
        vehicle[1].setMakeModel("Toyota Camry");
        vehicle[1].setColor("Blue");
        vehicle[1].setOdometerReading(60000);
        vehicle[1].setPrice(11000);

        vehicle[2] = new Vehicle();
        vehicle[2].setVehicleId(101123);
        vehicle[2].setMakeModel("Chevrolet Malibu");
        vehicle[2].setColor("Black");
        vehicle[2].setOdometerReading(50000);
        vehicle[2].setPrice(9700);

        vehicle[3] = new Vehicle();
        vehicle[3].setVehicleId(101124);
        vehicle[3].setMakeModel("Honda Civic");
        vehicle[3].setColor("White");
        vehicle[3].setOdometerReading(70000);
        vehicle[3].setPrice(7500);

        vehicle[4] = new Vehicle();
        vehicle[4].setVehicleId(101125);
        vehicle[4].setMakeModel("Subaru Outback");
        vehicle[4].setColor("Green");
        vehicle[4].setOdometerReading(55000);
        vehicle[4].setPrice(14500);

        return vehicle;
    }
    public static void printAllVehicleInfo(Vehicle[] vehicles){
        for(Vehicle vehicle: vehicles){
            printVehicleInfo(vehicle);
        }
        //promptUserMenu(vehicles);
    }
    public static void printVehicleInfo(Vehicle vehicle){
        System.out.printf("%d %s %s %d $%.2f\n",
                vehicle.getVehicleId(),
                vehicle.getMakeModel(),
                vehicle.getColor(),
                vehicle.getOdometerReading(),
                vehicle.getPrice());
    }
    public static void searchForVehicle(Vehicle[] vehicles){
        System.out.println("\nEnter the name of the car you wish to search: ");
        String carSearch = scanner.nextLine();

        for(Vehicle vehicle: vehicles) {
            if (vehicle.getMakeModel().equalsIgnoreCase(carSearch)) {
                printVehicleInfo(vehicle);
            }
        }
        //promptUserMenu(vehicles);
    }
    public static void searchForVehicleByPrice(Vehicle[] vehicles){
        System.out.println("\nEnter the maximum price you're willing to pay: ");
        float priceSearch = scanner.nextFloat();

        for(Vehicle vehicle: vehicles) {
            if (vehicle.getPrice() <= priceSearch) {
                printVehicleInfo(vehicle);
            }
        }
        //promptUserMenu(vehicles);
    }
    public static void searchForVehicleByColor(Vehicle[] vehicles){
        System.out.println("\nEnter the color of the car(s) you wish to search: ");
        String carSearch = scanner.nextLine();

        for(Vehicle vehicle: vehicles) {
            if (vehicle.getColor().equalsIgnoreCase(carSearch)) {
                printVehicleInfo(vehicle);
            }
        }
        //promptUserMenu(vehicles);
    }
    public static void addNewVehicle(Vehicle[] vehicles){
        int index = currentVehiclePositionInArray(vehicles);
        vehicles[index] = new Vehicle();
        vehicles[index].setVehicleId(vehicles[index-1].getVehicleId() + 1);
        String newModel = promptForString("\nEnter the make/model of the vehicle you'd like to add: ");
        vehicles[index].setMakeModel(newModel);
        String newColor = promptForString("\nEnter the color of the vehicle you'd like to add: ");
        vehicles[index].setColor(newColor);
        int newOdometer = promptForInt("\nEnter the odometer reading for this car: ");
        vehicles[index].setOdometerReading(newOdometer);
        float newPrice = promptForFloat("\nEnter the new price for this vehicle: $");
        vehicles[index].setPrice(newPrice);

        //promptUserMenu(vehicles);
    }
    public static int currentVehiclePositionInArray(Vehicle[] vehicles){
        for (int i = 0; i < vehicles.length; i++){
            if(vehicles[i] == null){
                return i;
            }
        }
        return -1;
    }
    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    public static int promptForInt(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static float promptForFloat(String prompt){
        System.out.print(prompt);
        scanner.nextLine();
        return scanner.nextFloat();
    }
}