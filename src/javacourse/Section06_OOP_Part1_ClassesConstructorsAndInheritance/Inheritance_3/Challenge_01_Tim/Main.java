package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_3.Challenge_01_Tim;

public class Main {

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(45);

        outlander.accelerate(30);
        System.out.println();
        System.out.println();
        outlander.accelerate(20);
        System.out.println();
        System.out.println();
        outlander.accelerate(-42);

    }
}
