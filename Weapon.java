/*
This class creates and uses the weapon object which each monster will
have. The object has setters and getters for names and damages.
 */

public class Weapon {
    private String name;
    private int MaxDamage;

    //Default constructor which is used when no overloaded constructor is used.
    public Weapon(){
        this.name = "Sharp looking rock";
        this.MaxDamage = 1;
    }

    //Overloaded constructor.
    public Weapon(String name, int MaxDamage){
        this.name = name;
        this.MaxDamage = MaxDamage;
    }

    // This method will return the name of the Weapon.
    public String getName(){
        return name;
    }

    // This method will set the name of the Weapon.
    public void setName(String name) {
        this.name = name;
    }

    // This method will return the MaxDamage of the attack.
    public int getMaxDamage() {
        return MaxDamage;
    }

    // This method will set the damage of the object.
    public void setMaxDamage(int damage){
        this.MaxDamage = damage;
    }
}
