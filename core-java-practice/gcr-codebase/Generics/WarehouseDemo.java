import java.util.ArrayList;
import java.util.List;


abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}

class Grocery extends WarehouseItem {
    public Grocery(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}


class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}


class WarehouseUtility {

    public static void displayItems(List<? extends WarehouseItem> items) {

        for (WarehouseItem item : items) {
            System.out.println(item);
        }

    }
}


public class WarehouseDemo {

    public static void main(String[] args) {


        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));


        Storage<Grocery> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Grocery("Rice"));
        groceryStorage.addItem(new Grocery("Milk"));


        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Electronics:");
        WarehouseUtility.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtility.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
}
