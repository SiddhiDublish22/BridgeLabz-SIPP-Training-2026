import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> recentlyPlayed = new LinkedList<>();

        playSong(recentlyPlayed, "Song A");
        playSong(recentlyPlayed, "Song B");
        playSong(recentlyPlayed, "Song C");

        searchSong(recentlyPlayed, "Song B");

        display(recentlyPlayed);
    }

    static void playSong(LinkedList<String> list, String song) {
        list.addFirst(song);

        if (list.size() > 10) {
            list.removeLast();
        }

        System.out.println("Played: " + song);
    }

    static void searchSong(LinkedList<String> list, String song) {
        if (list.contains(song)) {
            System.out.println(song + " found in recently played list");
        } else {
            System.out.println(song + " not found");
        }
    }

    static void display(LinkedList<String> list) {
        System.out.println("\nRecently Played Songs:");
        for (String song : list) {
            System.out.println(song);
        }
    }
}