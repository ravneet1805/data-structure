// 4. Singly Linked List: Inventory Management System
import java.util.Scanner;

class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    public Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryList {
    Item head;

    void addItem(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        inventory.addItem("Laptop", 101, 5, 75000);
        inventory.addItem("Mouse", 102, 15, 500);
        inventory.displayInventory();
    }
}