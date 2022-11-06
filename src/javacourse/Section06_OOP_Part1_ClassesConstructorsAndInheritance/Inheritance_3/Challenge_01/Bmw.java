package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_3.Challenge_01;

public class Bmw extends Car{

    private String specificBmwGear;


    public Bmw(int speed, String steering, String fuel, String changingGear, int wheels, String specificBmwGear) {
        super(speed, steering, fuel, changingGear, wheels);
        this.specificBmwGear = specificBmwGear;
    }

    // METHOD OVERLOADING
    public Bmw(int speed, String steering, String fuel, String changingGear, int wheels) {
        super(speed, steering, fuel, changingGear, wheels);
        this.specificBmwGear = "No extras specified";
    }

    public String getSpecificBmwGear() {
        return specificBmwGear;
    }
}
