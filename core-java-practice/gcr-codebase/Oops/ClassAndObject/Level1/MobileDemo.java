package ClassAndObject.Level1;

class MobilePhone {

    String brand;
    String model;
    double price;

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobileDemo {

    public static void main(String[] args) {

        MobilePhone m = new MobilePhone();

        m.brand = "Samsung";
        m.model = "S24";
        m.price = 75000;

        m.display();
    }
}
