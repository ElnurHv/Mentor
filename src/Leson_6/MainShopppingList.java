package Leson_6;

public class MainShopppingList {
    public static void main(String[] args) {


                Item item1 = new Item("Apple", 1.5);
                Item item2 = new Item("Banana", 0.75);
                Item item3 = new Item("Orange", 2.0);
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(item1);
        shoppingList.addItem(item2);
        shoppingList.addItem(item3);

        System.out.println(shoppingList);

            }
        }



