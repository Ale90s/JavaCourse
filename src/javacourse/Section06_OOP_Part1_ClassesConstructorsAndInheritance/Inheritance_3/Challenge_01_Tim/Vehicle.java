package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_3.Challenge_01_Tim;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.printf("Vehicle.steer(): Steering at %d degrees.\n", this.currentDirection);
    }

    public void move (int velocity ,int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.printf("Vehicle.move(): Moving at %d in direction %d\n", currentVelocity, currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
