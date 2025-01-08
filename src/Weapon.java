public class Weapon extends Item {
    private int damage;
    private int type;

    public Weapon(String name, int quantity, int damage, int type) {
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public int getType() {
        return type;
    }
}
