// 3. Circular Linked List: Task Scheduler
class Task {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    private Task head;

    public void addTask(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }
    
    public void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task: " + temp.taskName + " (ID: " + temp.taskID + ")");
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(101, "Complete Assignment", 1, "2024-07-10");
        scheduler.addTask(102, "Prepare Presentation", 2, "2024-07-15");
        scheduler.displayTasks();
    }
}