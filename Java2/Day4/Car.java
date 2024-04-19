package java2Abstract;
 /*Create two subclasses of `Vehicle`: `Car` and `Motorcycle`. Each subclass should inherit from the `Vehicle` class
    and add its own specific attributes and methods:
            - `Car`:
            - Additional attributes:
            - `numDoors` (int): Represents the number of doors the car has.
            - `fuelType` (String): Represents the type of fuel the car uses.
            - Additional methods:
            - `calculateMileage()`: Calculates and returns the mileage of the car based on certain criteria.
            - `Motorcycle`:
            - Additional attributes:
            - `hasSidecar` (boolean): Indicates whether the motorcycle has a sidecar or not. - `engineCapacity` (int): Represents the engine capacity of the motorcycle. - Additional methods:
            - `calculateSpeed()`: Calculates and returns the top speed of the motorcycle based on certain criteria.

*/

public class Car extends Vehicle {
    int numDoors;
    String fuelType;
    double mileage;

    public double calaculateMileage()
    {
        return mileage;
    }

    @Override
    public void displayDetails() {
        System.out.print(this.fuelType+ " ");
        System.out.print(this.mileage+ " ");
        System.out.print(this.make+ " ");
        System.out.print(this.year+ " ");
        System.out.print(this.model+ " ");
        System.out.print(this.numDoors);
        System.out.println();
    }

    public Car()
    {
        System.out.println("Tis is no argument constructor for Car class");
    }

    public Car(String fuelType, int mileage, String make, int year, String model, int numDoors )
    {
        super(make,model,year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }
    public static void main(String[] args) {
        Car c=new Car("petrol", 456, "adf",2022,"Toyato", 5);
       // c.displayDetails();
        System.out.println(c.make + " "+ c.model+ " "+c.year);
    }
}


