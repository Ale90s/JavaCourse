package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Composition_1.RoomOfAHouse;

public class Room {

    private int floor;
    private WardRobe wardRobe;
    private Bed bed;
    private Desktop desktop;

    public Room(int floor, WardRobe wardRobe, Bed bed, Desktop desktop) {
        this.floor = floor;
        this.wardRobe = wardRobe;
        this.bed = bed;
        this.desktop = desktop;
    }

    public int getFloor() {
        return floor;
    }

    public String getWardRobeFeatures() {
        return "Model : " + wardRobe.getModel() + " | Manufacturer : " +  wardRobe.getManufacturer() + " | Dimensions ->  " +  wardRobe.getDimensions();
    }

    public Bed getBed() {
        return bed;
    }

    public Desktop getDesktop() {
        return desktop;
    }
}
