package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Composition_1.RoomOfAHouse;

public class WardRobe {

    private String model;
    private String manufacturer;
    private Dimensions dimensions;

    public WardRobe(String model, String manufacturer, Dimensions dimensions) {
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

    public String getDimensions() {
        return "Height : " + dimensions.getHeight() + " | Width : " + dimensions.getWidth() + " | Depth : " + dimensions.getDepth();
    }
}
