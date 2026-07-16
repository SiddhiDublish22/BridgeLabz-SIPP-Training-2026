import java.util.*;

public class MostFrequentError {

    public static int mostFrequent(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = arr[0];
        int maxFreq = 0;

        for (int num : arr) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = num;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {404, 500, 404, 200, 404, 500};

        System.out.println(mostFrequent(arr));
    }
}