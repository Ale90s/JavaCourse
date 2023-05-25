package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Polymorphism_3.Challenge_111;

public class Main {

    public static void main(String[] args) {

        Car regularCar = new Car("Car without any particular type");
        Car gasCar = new GasPoweredCar("Gas powered car...",300.50,10);
        Car electricCar = new ElectricCar("This is an electric car", 500, 2500);


        Car[] coches = {regularCar, gasCar, electricCar};

        for (int i = 0; i < coches.length; i++) {
            System.out.println(coches[i].getDescription());
            coches[i].drive();
            System.out.println("\n");
        }

    }
}
