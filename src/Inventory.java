import java.util.ArrayList;

public class Inventory {

    // 1 declaring item Objects
    private ArrayList<Item> items;

// generated constructor
//    public Inventory(ArrayList<Item> items) {
//        this.items = items;
//    }

    // modified constructor with new ArrayList of items
public Inventory(){
    items = new ArrayList<>();
}

//public void addItem(Item item){
//    items.add(item);
//}
public void addItem(Item item){
    items.add(item);
}



public void displayInventory(){
       for (Item item: items){
           System.out.println(item.toString());
       }
   }
}

