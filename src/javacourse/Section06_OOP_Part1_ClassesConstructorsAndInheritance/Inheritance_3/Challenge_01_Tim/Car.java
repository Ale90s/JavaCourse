package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_3.Challenge_01_Tim;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.printf("Car.setCurrentGear(): Changed to %d gear.\n", this.currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        System.out.printf("Car.changeVelocity() : Velocity %d direction %d\n", speed, direction);
        move(speed, direction);
    }


}
