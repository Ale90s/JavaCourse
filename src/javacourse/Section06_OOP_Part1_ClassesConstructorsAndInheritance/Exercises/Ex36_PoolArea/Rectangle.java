package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex36_PoolArea;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double height) {
        this.width = width > 0 ? width : 0;
        this.length = height > 0 ? height : 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (width * length);
    }
}
