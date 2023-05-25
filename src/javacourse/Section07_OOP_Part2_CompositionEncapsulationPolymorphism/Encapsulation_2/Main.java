package javacourse.Section07_OOP_Part2_CompositionEncapsulationPolymorphism.Encapsulation_2;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        player.name = "Ale";
        player.health = 50;
        player.weapon= "Sword";

        int damage = 10;
        player.loseHealth(10);
        System.out.printf("Remainin health = " + player.healthRemaining());
    }
}
