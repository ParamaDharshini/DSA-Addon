package Day5;

import java.util.Scanner;

public class PostAssignment {
	
	
	    private static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;

	    public  PostAssignment() {
	        tail = null;
	    }

	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            tail = newNode;
	            tail.next = newNode;
	        } else {
	            newNode.next = tail.next;
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    public void deleteFromHead() {
	        if (tail == null) {
	            System.out.println("List is empty. Nothing to delete.");
	            return;
	        }
	        Node head = tail.next;
	        if (head == tail) { // only one node
	            System.out.println("Deleted from head: " + head.data);
	            tail = null;
	        } else {
	            System.out.println("Deleted from head: " + head.data);
	            tail.next = head.next;
	        }
	    }

	    public void deleteAtPosition(int position) {
	        if (tail == null) {
	            System.out.println("List is empty. Nothing to delete.");
	            return;
	        }
	        if (position <= 0) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        Node head = tail.next;
	        if (position == 1) {
	            deleteFromHead();
	            return;
	        }
	        Node current = head;
	        Node prev = null;
	        int count = 1;
	        while (count < position && current != tail) {
	            prev = current;
	            current = current.next;
	            count++;
	        }
	        if (count != position) {
	            System.out.println("Position out of bounds.");
	            return;
	        }
	        System.out.println("Deleted: " + current.data);
	        prev.next = current.next;
	        if (current == tail) {
	            tail = prev;
	        }
	    }

	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node current = tail.next;
	        do {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != tail.next);
	        System.out.println("(back to head)");
	    }

	    public static void main(String[] args) {
	    	 PostAssignment cll = new  PostAssignment();
	        Scanner sc = new Scanner(System.in);
	        int choice, data, pos;

	        while (true) {
	            System.out.println("\n--- Circular Linked List Menu ---");
	            System.out.println("1. Insert at Tail");
	            System.out.println("2. Delete from Head");
	            System.out.println("3. Delete at Position");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to insert: ");
	                    data = sc.nextInt();
	                    cll.insertAtTail(data);
	                    break;

	                case 2:
	                    cll.deleteFromHead();
	                    break;

	                case 3:
	                    System.out.print("Enter position to delete: ");
	                    pos = sc.nextInt();
	                    cll.deleteAtPosition(pos);
	                    break;

	                case 4:
	                    cll.display();
	                    break;

	                case 5:
	                    System.out.println("Exiting... Goodbye!");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	


}
