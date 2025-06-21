// Brick 1: Node class and basic singly linked list
// Problem: Create a Node class and build a simple linked list
// Intuition: Each node holds data + pointer to next node

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListBasics {
    Node head;

    // 🔨 Insert at end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Traverse and print
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 🧪 Main method to test
    public static void main(String[] args) {
        LinkedListBasics list = new LinkedListBasics();

        // Add some values
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Print list
        list.printList();  // Output: 10 -> 20 -> 30 -> null
    }
}
