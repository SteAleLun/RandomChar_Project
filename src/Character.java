public class Character {

    private String name;
    private String weapon;
    private int damage;


    // Constructors

    public Character() {
    }

    public Character(String name, String weapon, int damage) {
        this.name = name;
        this.weapon = weapon;
        this.damage = damage;
    }


    // get() / set()

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    // toString

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                '}';
    }
}
