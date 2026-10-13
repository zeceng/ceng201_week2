/**
 * SinglyLinkedList.java
 * Represents a singly linked list.
 *Name: Zeynep Ece Özaslan
 *Student ID: 250444039
 *Date: 12.10.2026
 */

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable
    private Node head;

    // -------------------------------------------------------
    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list
    public void add(int data) {
        // 1. Create a new Node with the given data.
        Node newNode = new Node(data);

        // 2. If the list is empty, make the new node the head.
        if (head == null) {
            head = newNode;
        } else {
            // 3. Otherwise, traverse to the last node.
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // 4. Link the last node to the new node.
            current.next = newNode;
        }
    }

    // -------------------------------------------------------
    // Display the linked list
    public void display() {
        // Start from head.
        Node current = head;
        // Visit each node using next and print in the specified format.
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Find the middle node
    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        // Count total number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Find the middle index (for even size, this gives the second middle node)
        int midIndex = count / 2;

        // Traverse again to reach the middle index
        current = head;
        for (int i = 0; i < midIndex; i++) {
            current = current.next;
        }

        return current;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}
