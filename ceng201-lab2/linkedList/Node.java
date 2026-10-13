/**
 * Node.java
 *
 * Represents one node in a singly linked list.
 *
 * Your Name:        Zeynep Ece Özaslan
 * Your Student ID:  250444039
 * Your Date:        2026-10-12
 */

public class Node {

    // Instance variables
    int data;
    Node next;

    // -------------------------------------------------------
    // Constructor
    public Node(int data) {
        // Initialize data with the passed parameter
        this.data = data;
        // Set next reference to null initially
        this.next = null;
    }
}