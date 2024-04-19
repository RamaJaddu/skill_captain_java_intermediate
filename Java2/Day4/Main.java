package java2Abstract;

/*In the `Main` class, create an inventory system where you can add and manage different vehicles. Implement
        the following functionalities:
        - Allow the user to add vehicles to the inventory by providing details such as make, model, year, price, and
        any specific attributes related to the vehicle type.
        - Provide an option to display the details of all the vehicles in the inventory.
        - Implement a search functionality that allows the user to search for a vehicle based on a specific criteria (e.g., make, model, price range).
        - Allow the user to update the details of a specific vehicle in the inventory.
        - Implement a feature to remove a vehicle from the inventory.
        */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> inventory = new ArrayList<>();

        addVehicle(inventory);
        searchVehicle(inventory, "BMW");
        updateVehicle(inventory, "BENZ");
        removeVehicle(inventory);
    }

    //Add vehicles to the inventory
    private static void addVehicle(ArrayList<Vehicle> inventory) {

        System.out.println("Adding Avehicles : ");
        inventory.add(new Car("petrol", 456, "adf", 2022, "Toyato", 5));
        inventory.add(new Car("Disel", 456, "adf", 2022, "BMW", 5));
        inventory.add(new Motorcycle(1278, "sdkn", 2011, "Honda", 60, false));
        inventory.add(new Motorcycle(18923, "sdk", 2011, "Honda", 60, false));
        inventory.add(new Car("petrol", 45986, "adf", 2022, "Benz", 5));

        //display the all vehicles
        for (Vehicle v : inventory) {
            v.displayDetails();
            System.out.println();
        }

    }

    //implement a search functionality on a specific criteria.
    private static void searchVehicle(ArrayList<Vehicle> inventory, String model) {

        System.out.println("Search for vehicles : ");


        for (Vehicle vehicle : inventory) {
            if (vehicle.model.equalsIgnoreCase(model)) {
                vehicle.displayDetails();
                System.out.println();

            } else  {

                System.out.println("Vehicle not found");
            }


        }

     }

    //Update the specific vehicle in the inventory

    private static void updateVehicle(ArrayList<Vehicle> inventory, String model){

        String name="Nano";

        System.out.println("\nUpdate Vehicles : \n");

        for(Vehicle v: inventory) {
            if (v.model.equalsIgnoreCase(model)) {
                v.model = name;
                System.out.println("v model updated as : " + v.model);
                v.displayDetails();
                System.out.println("Vehicle details are updated");
            }

        }

    }

    //Remove the specific vehicle in the inventory
    private static void removeVehicle(ArrayList<Vehicle> inventory){
        System.out.println("\nRemove specific vehicle in the Inventory\n");
        inventory.remove(3);
        for (Vehicle vehicle : inventory) {
                vehicle.displayDetails();
                System.out.println();
            System.out.println("arraylist size : "+ inventory.size());

        }

    }







// user input
}
