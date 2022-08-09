
public class GameCharacter {

    private String name, weapon;
    private int health;
    private int power;

    GameCharacter(String name, int power, int health, String weapon) {
        // ! constructor is a special method that is automatically called when an object
        // is created
        this.name = name;
        this.power = power;
        this.health = health;
        this.weapon = weapon;
    }

    public void Ability() {

        System.out.printf("The %s Character has a %s Power with the %d Health   \n", name, weapon, health);

    }

}
