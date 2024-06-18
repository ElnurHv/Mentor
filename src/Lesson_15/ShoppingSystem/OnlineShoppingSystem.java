package Lesson_15.ShoppingSystem;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        Item item=new Item("Apple",2);
        Item item1=new Item("Garbage",4);
        cart.addItem(item);
        cart.addItem(item1);



        cart.purchaseItem("Apple",4);
        cart.purchaseItem("Garbage",1);
        cart.purchaseItem("Grabage",10);

    }

}

