package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Composition_1.RoomOfAHouse;

public class Bed {

    private String model;
    private String manufacturer;
    private Dimensions dimensions;

    public Bed(String model, String manufacturer, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
