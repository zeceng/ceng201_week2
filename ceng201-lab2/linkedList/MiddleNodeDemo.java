/**
 * MiddleNodeDemo.java
 * Tests the singly linked list and findMiddle() method.
 * Name: Zeynep Ece Özaslan
 * Student ID: 250444039
 * Date: 12.10.2026
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // 1. Create a singlyLinkedList
        SinglyLinkedList list1 = new SinglyLinkedList();
        // 2. Add 1, 2, 3, 4, 5 Nodes to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("List 1:");
        // 3. Display the list
        list1.display();

        // 4. Find and print the middle Node
        Node mid1 = list1.findMiddle();
        System.out.println("Middle Node: " + (mid1 != null ? mid1.data : "null"));
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // 1. Create another singlyLinkedList
        SinglyLinkedList list2 = new SinglyLinkedList();
        // 2. Add 10, 20, 30, 40, 50, 60 Nodes to the list
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("List 2:");
        // 3. Display the list
        list2.display();

        // 4. Find and print the middle Node
        Node mid2 = list2.findMiddle();
        System.out.println("Middle Node: " + (mid2 != null ? mid2.data : "null"));
        System.out.println();
    }
}