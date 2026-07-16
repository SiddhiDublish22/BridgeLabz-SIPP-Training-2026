import java.util.*;

class Patient {
    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalER {

    public static void main(String[] args) {

        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        pq.offer(new Patient(3, "Aman"));
        pq.offer(new Patient(1, "Riya"));
        pq.offer(new Patient(2, "Rahul"));

        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " Priority: " + p.priority);
        }
    }
}