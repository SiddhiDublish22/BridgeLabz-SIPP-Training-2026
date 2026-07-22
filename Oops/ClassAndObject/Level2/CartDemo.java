package ClassAndObject.Level2;

class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {

        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem(int q) {

        if (quantity >= q)
            quantity -= q;

        else
            System.out.println("Not enough quantity");
    }

    void displayTotalCost() {

        double total = price * quantity;

        System.out.println("Total Cost = " + total);
    }
}

public class CartDemo {

    public static void main(String[] args) {

        CartItem c = new CartItem();

        c.addItem("Laptop", 50000, 2);

        c.removeItem(1);

        c.displayTotalCost();
    }
}