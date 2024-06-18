package Lesson_15.ShoppingSystem;

public class Item {
    private String name;
    private int quanity;

    public Item(String name, int quanity) {
        this.name = name;
        this.quanity = quanity;
    }

    public String getName() {
        return name;
    }

    public int getQuanity() {
        return quanity;
    }


    public void decraseQuanity(int serachQuantity) throws OutOfStockException  {
        if (serachQuantity > quanity) {
            throw new OutOfStockException("Not enough " + name);
        } else {
            quanity -= serachQuantity;
        }


    }
    }


