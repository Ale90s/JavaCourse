package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_3.Challenge_01;

public class Main {

    public static void main(String[] args) {

        Bmw a3 = new Bmw(300, "Straight forward", "Oil", "Break every two years" ,4);

        System.out.println("The BMW A3 has the following characteristics: ");
        System.out.printf("It can get up to %d km/h\nIts regular steering is %s", a3.getSpeed(), a3.getSteering());

    }
}
