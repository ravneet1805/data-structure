// 6. Circular Linked List: Round Robin Scheduling Algorithm
import java.util.LinkedList;

class Process {
    int id, burstTime, priority;
    Process next;

    public Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    Process head;

    void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.id + ", Burst Time: " + temp.burstTime);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 20, 2);
        scheduler.displayProcesses();
    }
}