public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Generic Item", 10);

        Fruit fruit = new Fruit("Fuji",20,"Apple");

        Weapon weapon = new Weapon("Sword",1,30,"2-Hand");


        inventory.addItem(item1);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
    }
}