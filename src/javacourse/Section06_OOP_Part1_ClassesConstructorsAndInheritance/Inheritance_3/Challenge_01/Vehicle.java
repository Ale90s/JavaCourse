package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_3.Challenge_01;

public class Vehicle {

    private int speed;
    private String steering;

    private String fuel;

    public Vehicle(int speed, String steering, String fuel) {
        this.speed = speed;
        this.steering = steering;
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public String getSteering() {
        return steering;
    }
}
