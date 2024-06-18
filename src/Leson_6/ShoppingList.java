package Leson_6;

import java.util.Arrays;

public class ShoppingList {
    Item[] item;
    int itemCount;

    public ShoppingList() {
        item = new Item[10]; // Assuming a maximum of 10 items in the list
        itemCount = 0;
    }

    public double calculateTotalCost() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += item[i].getPrice();
        }
        return total;
    }

    public void addItem(Item newItem) {
        if (itemCount < item.length) {
            item[itemCount] = newItem;
            itemCount++;
        } else {
            System.out.println("Shopping list is full. Cannot add more items.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping List:\n");
        for (int i = 0; i < itemCount; i++) {
            sb.append(item[i]).append("\n");
        }
        sb.append("Total Cost: $").append(calculateTotalCost());
        return sb.toString();
    }
}



