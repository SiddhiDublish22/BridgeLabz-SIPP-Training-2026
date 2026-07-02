import java.util.*;

public class ParkingManager {
    public static void main(String[] args) {
        ArrayList<String> vehicles = new ArrayList<>();

        vehicles.add("UP15AB1234");
        vehicles.add("DL01CD5678");

        String search = "UP15AB1234";

        if (vehicles.contains(search)) {
            System.out.println(search + " is parked");
        } else {
            System.out.println(search + " is not parked");
        }

        vehicles.remove("DL01CD5678");

        System.out.println("\nParked Vehicles:");
        for (String v : vehicles) {
            System.out.println(v);
        }

        System.out.println("Total occupied slots: " + vehicles.size());
    }
}