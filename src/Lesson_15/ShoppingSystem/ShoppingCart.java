package Lesson_15.ShoppingSystem;

public class ShoppingCart {
    private Item[] items;

    public ShoppingCart() {
        items = new Item[0];
    }

    public void addItem(Item item) {
        Item[] newItems = new Item[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];

        }
        newItems[items.length] = item;
        items = newItems;


    }


    public void purchaseItem(String itemName, int quantity) {
        Item item=getItem(itemName);
        if (item !=null){
            try{
                item.decraseQuanity(quantity);
                System.out.println("Succesfully purchased "+quantity+" units of "+itemName);

            }catch (OutOfStockException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Item not found "+itemName);
        }

    }


    public Item getItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}