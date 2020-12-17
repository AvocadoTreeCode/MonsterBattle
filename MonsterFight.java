/*
This class will start the fight which will initiate the fight and set the
actual name of the weapons and the monsters.
 */
import java.util.Scanner;

public class MonsterFight {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    // Instantiate two weapon objects that will be used by the monsters.
        Weapon weapon1 = new Weapon("Focus Blast", 140);
        Weapon weapon2 = new Weapon("Fire Blast", 120);
        Monster monster1 = new Monster("Mewtwo", 150, weapon1);
        Monster monster2 = new Monster("Charizard", 120, weapon2);
        // The round starts at 1.
        int round = 1;
        // The battle should continue to until one of the monsters is zero.
        System.out.println("Let's get ready to rumbleeeeeeeeeeeeee");
        while (monster1.getHealthPoints() > 0 && monster2.getHealthPoints() > 0) {
            int damage1 = monster1.attack(monster2); // First monster goes first.
            int damage2 = monster2.attack(monster1); // Second monster goes next.
            // Show the results of the battle after the round.
            System.out.println("---------------------------------------------");
            System.out.println("=============================================");
            System.out.println("Round #" + round);
            System.out.println("=============================================");
            System.out.println(monster1.getName() + " attacks " + monster2.getName() + " with " +
                    monster1.getWeaponName() + " doing " + damage1 + " point of damage.");
            System.out.println(monster2.getName() + " attacks " + monster1.getName() + " with " +
                    monster2.getWeaponName() + " doing " + damage2 + " point of damage.");
            System.out.println("=============================================");
            System.out.println(monster1.getName() + " Health = " + monster1.getHealthPoints());
            System.out.println(monster2.getName() + " Health = " + monster2.getHealthPoints());
            // Prompt the user to press enter to continue the battle.
            System.out.println("Press ENTER to continue....");
            scan.nextLine();
            // Continue to the next round.
            round += 1;
        }
        // Now to determine the winner of the battle.
        String Victorious = "No Monster";
        if (monster1.getHealthPoints() > 0) {
            Victorious = monster1.getName();
        }
        if (monster2.getHealthPoints() > 0) {
            Victorious = monster2.getName();
        }
        System.out.println("The winner of the battle is " + Victorious + "!");
    }
}
