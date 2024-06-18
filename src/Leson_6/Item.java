package Leson_6;

public class Item {
    String name;
    double price;


    public double getPrice() {
        return price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
