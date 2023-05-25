package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Polymorphism_3.Challenge_111;

public class Car {

    protected String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("The engine is starting...");
        System.out.println("..........");
        System.out.println("The engane has been started");
    }

    public void drive() {
        System.out.println("You are driving a " + this.getName());
    }

    protected void runEngine() {
        System.out.println("You are running the engine of a " + this.getName());
    }

    private String getName() {
        return "Regular car.";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
