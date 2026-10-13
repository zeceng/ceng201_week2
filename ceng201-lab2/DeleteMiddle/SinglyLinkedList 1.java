/**
 * SinglyLinkedList.java
 * Represents a singly linked list with deleteMiddle functionality.
 * Name: Zeynep Ece Özaslan
 * Student ID: 250444039
 * Date: 12.10.2026
 */
package Exercise2;

public class SinglyLinkedList {

    // Instance variable
    private Node head;

    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list
    public void add(int data) {
        // 1. Create a new Node.
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
        // Visit each node using next and print.
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {
        // If the list is empty, there is nothing to delete
        if (head == null) {
            return;
        }

        // If there is only one node, the list becomes empty
        if (head.next == null) {
            head = null;
            return;
        }

        // Step 1: Count the total number of nodes.
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Step 2: Find the node before the middle node.
        int midIndex = count / 2;
        int targetPrevIndex = midIndex - 1;

        // Traverse to the node right before the middle node
        Node prev = head;
        for (int i = 0; i < targetPrevIndex; i++) {
            prev = prev.next;
        }

        // Change its next reference so that the middle node is removed from the list.
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}
