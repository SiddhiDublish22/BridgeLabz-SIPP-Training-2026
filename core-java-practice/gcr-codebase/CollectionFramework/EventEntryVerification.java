import java.util.*;

public class EventEntryVerification {
    public static void main(String[] args) {
        HashSet<String> participants = new HashSet<>();

        register(participants, "siddhi@gmail.com");
        register(participants, "rahul@gmail.com");
        register(participants, "siddhi@gmail.com");

        System.out.println("\nUnique Participants:");
        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total attendees: " + participants.size());
    }

    static void register(HashSet<String> participants, String email) {
        if (participants.add(email)) {
            System.out.println("Registered: " + email);
        } else {
            System.out.println("Duplicate registration rejected: " + email);
        }
    }
}