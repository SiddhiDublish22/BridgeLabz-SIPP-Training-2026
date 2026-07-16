import java.util.Scanner;

public class PacketBuffer {

    int[] data;
    int front, count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int x) {
        if (count == data.length) {
            System.out.println("Queue Full");
            return false;
        }

        data[(front + count) % data.length] = x;
        count++;
        return true;
    }

    int dequeue() {
        if (count == 0) {
            System.out.println("Queue Empty");
            return -1;
        }

        int val = data[front];
        front = (front + 1) % data.length;
        count--;

        return val;
    }

    public static void main(String[] args) {
        PacketBuffer q = new PacketBuffer(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}