package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Composition_1.RoomOfAHouse_Tim;

public class Ceiling {

    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
