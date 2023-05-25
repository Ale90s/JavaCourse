package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Composition_1.RoomOfAHouse;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(1, new WardRobe("AB-330", "IKEA", new Dimensions(210, 200, 100)),
                new Bed("448-456-2205", "IKEA", new Dimensions(200, 200, 0)),
                new Desktop("Yco-4", "IKEA", new Dimensions(80, 60, 30)));

        System.out.println("WARDROBE FEATURES:");
        System.out.println(room1.getWardRobeFeatures());

        System.out.println();

        System.out.println("BED MODEL:");
        System.out.println(room1.getBed().getModel());
    }
}
