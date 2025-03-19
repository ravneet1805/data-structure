// 7. Singly Linked List: Social Media Friend Connections
import java.util.ArrayList;

class User {
    int userId;
    String name;
    ArrayList<Integer> friendIds;
    User next;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.friendIds = new ArrayList<>();
    }
}

class SocialMedia {
    User head;

    void addUser(int userId, String name) {
        User newUser = new User(userId, name);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    void displayUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println("User: " + temp.name + ", ID: " + temp.userId);
            temp = temp.next;
        }
    }
}

public class SocialMediaConnections {
    public static void main(String[] args) {
        SocialMedia network = new SocialMedia();
        network.addUser(1, "Alice");
        network.addUser(2, "Bob");
        network.displayUsers();
    }
}
