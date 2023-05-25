package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex35_Cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {

        this.radius = radius > 0 ? radius : 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
