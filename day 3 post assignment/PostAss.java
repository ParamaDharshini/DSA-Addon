package day3;

import java.util.Scanner;

public class PostAss {

	

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	    Node head;

	    
	    void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

	    
	    void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (position == 0) {
	            head = head.next;
	            System.out.println("Deleted node at position 0.");
	            return;
	        }
	        Node current = head;
	        int count = 0;
	        while (current != null && count < position - 1) {
	            current = current.next;
	            count++;
	        }
	        if (current == null || current.next == null) {
	            System.out.println("Position out of bounds.");
	            return;
	        }
	        current.next = current.next.next;
	        System.out.println("Deleted node at position " + position + ".");
	    }

	    
	    void traverse() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node current = head;
	        System.out.print("List elements: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    
	    void reverse() {
	        Node prev = null, current = head, next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	        System.out.println("List reversed.");
	        
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        PostAss list = new PostAss();
	        int choice, data, pos;

	        do {
	            System.out.println("\n--- Singly Linked List Menu ---");
	            System.out.println("1. Insert at end");
	            System.out.println("2. Delete at position");
	            System.out.println("3. Traverse list");
	            System.out.println("4. Reverse list");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to insert: ");
	                    data = sc.nextInt();
	                    list.insert(data);
	                    System.out.println(data + " inserted.");
	                    break;

	                case 2:
	                    System.out.print("Enter position to delete (0-based): ");
	                    pos = sc.nextInt();
	                    list.deleteAtPosition(pos);
	                    break;

	                case 3:
	                    list.traverse();
	                    break;

	                case 4:
	                    list.reverse();
	                    list.traverse();
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        } while (choice != 5);

	        sc.close();
	    }
	

}
