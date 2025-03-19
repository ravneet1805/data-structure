
// 9. Queue Implementation Using Linked List
class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    QueueNode front, rear;

    void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    int dequeue() {
        if (front == null) return -1;
        int value = front.data;
        front = front.next;
        return value;
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
    }
}
