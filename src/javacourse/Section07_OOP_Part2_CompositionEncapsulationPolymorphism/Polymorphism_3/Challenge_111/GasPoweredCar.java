package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Polymorphism_3.Challenge_111;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public String getDescription() {
        return this.description + "\nAverage Km per Litre: " + this.avgKmPerLitre + "\nCylinders: " + this.cylinders;
    }
    @Override
    public void drive() {
        System.out.println("You are driving a " + this.getName());
    }

    private String getName() {
        return "Gas Powered Car";
    }

}
