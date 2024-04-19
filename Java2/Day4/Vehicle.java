package java2Abstract;

/*1. Create an abstract class called `Vehicle` with the following attributes and methods:
            - Attributes:
            - `make` (String): Represents the make of the vehicle.
            - `model` (String): Represents the model of the vehicle.
            - `year` (int): Represents the year of manufacture of the vehicle. - `price` (double): Represents the price of the vehicle.
            - Methods:
            - `displayDetails()`: Abstract method that should be implemented by the subclasses to display
            the details of the vehicle.
*/



public abstract class  Vehicle {

    String make;
    String model;
    int year;

    public abstract void displayDetails();

    public Vehicle() {
        System.out.println("This is no Argument constructor for Vehicle class");
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}


