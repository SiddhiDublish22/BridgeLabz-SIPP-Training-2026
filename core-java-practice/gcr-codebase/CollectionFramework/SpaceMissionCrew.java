import java.util.*;

class Astronaut {
    String astronautId;
    String name;
    String specialization;

    Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return astronautId + " | " + name + " | " + specialization;
    }
}

public class SpaceMissionCrew {
    public static void main(String[] args) {
        HashMap<String, List<Astronaut>> missions = new HashMap<>();
        HashMap<String, HashSet<String>> missionIds = new HashMap<>();

        addMission(missions, missionIds, "Moon Mission");
        addMission(missions, missionIds, "Mars Mission");

        assignAstronaut(missions, missionIds, "Moon Mission",
                new Astronaut("A101", "Siddhi", "Pilot"));

        assignAstronaut(missions, missionIds, "Moon Mission",
                new Astronaut("A102", "Rahul", "Engineer"));

        assignAstronaut(missions, missionIds, "Moon Mission",
                new Astronaut("A101", "Siddhi", "Pilot"));

        assignAstronaut(missions, missionIds, "Mars Mission",
                new Astronaut("A101", "Siddhi", "Pilot"));

        displayMissions(missions);
    }

    static void addMission(HashMap<String, List<Astronaut>> missions,
                           HashMap<String, HashSet<String>> missionIds,
                           String missionName) {

        missions.putIfAbsent(missionName, new ArrayList<>());
        missionIds.putIfAbsent(missionName, new HashSet<>());

        System.out.println("Mission added: " + missionName);
    }

    static void assignAstronaut(HashMap<String, List<Astronaut>> missions,
                                HashMap<String, HashSet<String>> missionIds,
                                String missionName,
                                Astronaut astronaut) {

        if (!missions.containsKey(missionName)) {
            addMission(missions, missionIds, missionName);
        }

        HashSet<String> ids = missionIds.get(missionName);

        if (ids.contains(astronaut.astronautId)) {
            System.out.println("Duplicate astronaut not allowed in " + missionName);
        } else {
            missions.get(missionName).add(astronaut);
            ids.add(astronaut.astronautId);
            System.out.println("Astronaut assigned to " + missionName);
        }
    }

    static void displayMissions(HashMap<String, List<Astronaut>> missions) {
        System.out.println("\nMission Details:");

        for (String mission : missions.keySet()) {
            System.out.println("\nMission: " + mission);

            for (Astronaut a : missions.get(mission)) {
                System.out.println(a);
            }

            System.out.println("Total astronauts: " + missions.get(mission).size());
        }
    }
}