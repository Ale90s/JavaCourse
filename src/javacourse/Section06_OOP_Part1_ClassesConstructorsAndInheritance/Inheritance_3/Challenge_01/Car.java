package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_3.Challenge_01;

public class Car extends Vehicle{

    private String changingGear;

    private int wheels;

    public Car(int speed, String steering, String fuel, String changingGear, int wheels) {
        super(speed, steering, fuel);
        this.changingGear = changingGear;
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public String getChangingGear() {
        return changingGear;
    }
}
