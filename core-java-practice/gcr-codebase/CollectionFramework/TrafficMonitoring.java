import java.util.*;

public class TrafficMonitoring {
    public static void main(String[] args) {
        HashMap<String, Integer> traffic = new HashMap<>();

        addOrUpdateTraffic(traffic, "MG Road", 120);
        addOrUpdateTraffic(traffic, "Ring Road", 250);
        addOrUpdateTraffic(traffic, "Civil Lines", 90);
        addOrUpdateTraffic(traffic, "MG Road", 80);

        displaySortedRoads(traffic);
        busiestRoad(traffic);
        generateReport(traffic);
    }

    static void addOrUpdateTraffic(HashMap<String, Integer> traffic,
            String roadName, int count) {

        traffic.put(roadName, traffic.getOrDefault(roadName, 0) + count);
        System.out.println("Traffic updated for: " + roadName);
    }

    static void displaySortedRoads(HashMap<String, Integer> traffic) {
        TreeMap<String, Integer> sortedRoads = new TreeMap<>(traffic);

        System.out.println("\nRoads in Sorted Order:");
        for (String road : sortedRoads.keySet()) {
            System.out.println(road + " : " + sortedRoads.get(road));
        }
    }

    static void busiestRoad(HashMap<String, Integer> traffic) {
        String busiest = "";
        int max = 0;

        for (String road : traffic.keySet()) {
            if (traffic.get(road) > max) {
                max = traffic.get(road);
                busiest = road;
            }
        }

        System.out.println("\nBusiest Road: " + busiest + " with " + max + " vehicles");
    }

    static void generateReport(HashMap<String, Integer> traffic) {
        System.out.println("\nTraffic Analysis Report:");

        int total = 0;

        for (String road : traffic.keySet()) {
            int count = traffic.get(road);
            total += count;
            System.out.println(road + " -> " + count + " vehicles");
        }

        System.out.println("Total vehicles recorded: " + total);
    }
}