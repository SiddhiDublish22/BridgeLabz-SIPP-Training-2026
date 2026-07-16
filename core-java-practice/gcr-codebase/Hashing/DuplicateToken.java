import java.util.*;

public class DuplicateToken {

    public static boolean hasDuplicate(String[] tokens) {
        HashSet<String> set = new HashSet<>();

        for (String token : tokens) {
            if (!set.add(token))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {"abc", "xyz", "pqr", "abc"};

        System.out.println(hasDuplicate(tokens));
    }
}