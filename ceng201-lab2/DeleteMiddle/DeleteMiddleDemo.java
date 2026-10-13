/**
 * DeleteMiddleDemo.java
 * Tests deleting the middle node of a singly linked list.
 * Name: Zeynep Ece Özaslan
 * Student ID: 250444039
 * Date: 12.10.2026
 */
package Exercise2;


public class DeleteMiddleDemo {

    public static void main(String[] args) {

        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // 1. Created a singlyLinkedList
        SinglyLinkedList list1 = new SinglyLinkedList();
        // 2. Add 1,2,3,4,5 Nodes to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("Original List 1:");
        // 3. Display the list
        list1.display();

        // 4. Delete the Middle Node
        list1.deleteMiddle();
        System.out.println("After deleting middle:");
        // 5. Display the list after deleting
        list1.display();
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // 1. Created another singlyLinkedList
        SinglyLinkedList list2 = new SinglyLinkedList();
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("Original List 2:");
        // 3. Display the list
        list2.display();

        // 4. Delete the Middle Node
        list2.deleteMiddle();
        System.out.println("After deleting middle:");
        // 5. Display the list after deleting
        list2.display();
        System.out.println();

        // -------------------------------------------------------
        // Test 3: One node
        // 1. Created another singlyLinkedList
        SinglyLinkedList list3 = new SinglyLinkedList();
        // 2. Add just 999 to the list
        list3.add(999);

        System.out.println("Original List 3:");
        // 3. Display the list
        list3.display();

        // 4. Delete the Middle Node (head becomes null)
        list3.deleteMiddle();
        System.out.println("After deleting middle:");
        // 5. Display the list after deleting
        list3.display();
    }
}