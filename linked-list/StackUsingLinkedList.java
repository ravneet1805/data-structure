// 8. Stack Implementation Using Linked List
class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    StackNode top;

    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) return -1;
        int value = top.data;
        top = top.next;
        return value;
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
    }
}
