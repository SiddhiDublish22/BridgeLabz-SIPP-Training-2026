import java.util.Scanner;

public class UndoBuffer {
    int[] data;
    int top;

    UndoBuffer(int size) {
        data = new int[size];
        top = -1;
    }

    boolean push(int x) {
        if (top == data.length - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        data[++top] = x;
        return true;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return data[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return data[top];
    }

    public static void main(String[] args) {
        UndoBuffer s = new UndoBuffer(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());
    }
}