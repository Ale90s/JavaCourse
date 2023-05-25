package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Polymorphism_3.Challenge_111;

public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public String getDescription() {
        return this.description + "\nAverage Kilometers per Charge: " + this.avgKmPerCharge + "\nBattery size: " + this.batterySize;
    }

    public void drive() {
        System.out.println("You are driving a " + getName());
    }
    private String getName() {
        return "Electric car";
    }
}
