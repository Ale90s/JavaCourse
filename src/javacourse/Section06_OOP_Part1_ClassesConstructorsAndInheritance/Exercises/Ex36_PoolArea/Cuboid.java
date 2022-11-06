package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex36_PoolArea;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height > 0 ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * height);
    }
}
