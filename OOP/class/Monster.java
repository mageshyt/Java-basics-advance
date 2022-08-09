import java.util.Scanner;

public class Monster {

    String MonsterName;

    String MonsterWeapon;

    void power() {
        System.out.printf("%s is using %s to attack 🔋 \n", MonsterName, MonsterWeapon);
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Monster Name: ");
        MonsterName = sc.nextLine();
        System.out.printf("Enter Monster Weapon: ");
        MonsterWeapon = sc.nextLine();
        sc.close();
    }

    void Damage() {
        System.out.printf("%s is doing damage 🔥 \n", MonsterName);
    }

}
