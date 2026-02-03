package hellowaorldcom.company;

public class DoubleLL {

    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Insert at the beginning
    public void InsertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at the end
    public void InsertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at a specific index
    public void InsertAtIndex(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            InsertAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node currNode = head;
        int i = 0;

        while (currNode != null && i < index - 1) {
            currNode = currNode.next;
            i++;
        }

        if (currNode == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = currNode.next;
        newNode.prev = currNode;

        if (currNode.next != null) {
            currNode.next.prev = newNode;
        } else {
            tail = newNode;  // inserting at last
        }

        currNode.next = newNode;
    }

    // Delete first node
    public void DeleteAtFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete last node
    public void DeleteAtLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Delete at a specific index
    public void DeleteAtIndex(int index) {
        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            DeleteAtFirst();
            return;
        }

        Node currNode = head;
        int i = 0;

        while (currNode != null && i < index) {
            currNode = currNode.next;
            i++;
        }

        if (currNode == null) {
            System.out.println("Index out of bounds");
            return;
        }

        if (currNode.prev != null) {
            currNode.prev.next = currNode.next;
        }

        if (currNode.next != null) {
            currNode.next.prev = currNode.prev;
        } else {
            tail = currNode.prev;  // deleting last node
        }
    }

    // Print the list
    public void print() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    // Main method to test
    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();

        // Insert
        list.InsertAtFirst(10);
        list.InsertAtFirst(20);
        list.InsertAtFirst(30);
        list.print(); // 30 <-> 20 <-> 10 <-> NULL

        list.InsertAtLast(100);
        list.print(); // 30 <-> 20 <-> 10 <-> 100 <-> NULL

        list.InsertAtIndex(2, 50);
        list.print(); // 30 <-> 20 <-> 50 <-> 10 <-> 100 <-> NULL

        // Delete
        list.DeleteAtFirst();
        list.print(); // 20 <-> 50 <-> 10 <-> 100 <-> NULL

        list.DeleteAtLast();
        list.print(); // 20 <-> 50 <-> 10 <-> NULL

        list.DeleteAtIndex(1);
        list.print(); // 20 <-> 10 <-> NULL
    }
}

