public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Generic Item", 10);

        Fruit fruit = new Fruit("Fuji","Apple",20);


        inventory.addItem(item1);
        inventory.addItem(fruit);
        inventory.displayInventory();
    }
}