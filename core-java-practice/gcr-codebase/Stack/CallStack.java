public class CallStack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Empty");
            return -1;
        }

        int val = top.data;
        top = top.next;
        return val;
    }

    int peek() {
        if (top == null) return -1;
        return top.data;
    }

    public static void main(String[] args) {
        CallStack s = new CallStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());
    }
}