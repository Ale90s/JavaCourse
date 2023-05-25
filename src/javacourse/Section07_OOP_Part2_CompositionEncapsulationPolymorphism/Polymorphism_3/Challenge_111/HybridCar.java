package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Polymorphism_3.Challenge_111;

public class HybridCar extends Car {

    private String avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, String avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

}
