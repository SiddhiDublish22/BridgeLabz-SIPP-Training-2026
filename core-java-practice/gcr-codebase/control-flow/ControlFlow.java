public class ControlFlow {
    static String ternary(int age) {
        return age > 10 ? "Greator than 10" : "not greator than 10";
    }

    public static void main(String[] args) {
        int k = 10;
        int res1 = k++ + --k + k + k-- - ++k - --k;
        System.out.println(res1);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int y = 10;
        while (y > 0) {
            System.out.println(y);
            y--;
        }
        int z = 20;
        do {
            System.out.println(z);
            z--;
        } while (z > 0);

    }
}