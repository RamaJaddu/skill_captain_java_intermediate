package java2Abstract;
/*

    `Motorcycle`:
            - Additional attributes:
            - `hasSidecar` (boolean): Indicates whether the motorcycle has a sidecar or not. -
            `engineCapacity` (int): Represents the engine capacity of the motorcycle. - Additional methods:
            - `calculateSpeed()`: Calculates and returns the top speed of the motorcycle based on certain criteria.
*/

public class Motorcycle extends Vehicle {


  boolean hasSidecar;
  int engineCapacity;
  double speed;

  public double calaculateSpeed(double speed)
  {
    return speed;
  }

  @Override
  public void displayDetails()
  {
    System.out.print(this.engineCapacity +" ");
    System.out.print(this.hasSidecar+" ");
    System.out.print(this.make+" ");
    System.out.print(this.year+" ");
    System.out.print(this.model+" ");
    System.out.print(this.speed+" ");
    System.out.println();
  }

  public Motorcycle()
  {
    System.out.println("This is no Argument constructor for Motorcycle class");
  }

  public Motorcycle(int engineCapacity, String make, int year, String model, int speed, boolean hasSidecar)
  {
    super(make, model, year);
    this.engineCapacity = engineCapacity;
    this.speed = speed;
    this.hasSidecar = hasSidecar;
  }

  public static void main(String[] args) {
    Motorcycle m = new Motorcycle(123,"sdkn",2011,"Honda", 60, false);
    System.out.println(m.make + " "+ m.model+ " "+m.year);
    m.displayDetails();
  }
}