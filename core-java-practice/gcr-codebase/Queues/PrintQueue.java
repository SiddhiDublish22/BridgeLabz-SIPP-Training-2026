import java.util.*;

public class PrintQueue {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addLast(101);
        dq.addLast(102);

        dq.addFirst(999);

        System.out.println("Print: " + dq.removeFirst());
        System.out.println("Print: " + dq.removeFirst());
        System.out.println("Print: " + dq.removeFirst());
    }
}