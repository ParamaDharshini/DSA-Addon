package day4;

import java.util.Scanner;

public class PostAss {
	
	
	    static class Node {
	        int data;
	        Node prev;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.prev = null;
	            this.next = null;
	        }
	    }

	    static class DoublyLinkedList {
	        Node head;
	        Node tail;

	        void append(int data) {
	            Node newNode = new Node(data);
	            if (head == null) {
	                head = tail = newNode;
	                return;
	            }
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }

	        void insertAtPosition(int data, int position) {
	            Node newNode = new Node(data);

	            if (position == 1) {
	                if (head == null) {
	                    head = tail = newNode;
	                } else {
	                    newNode.next = head;
	                    head.prev = newNode;
	                    head = newNode;
	                }
	                return;
	            }

	            Node current = head;
	            int count = 1;
	            while (current != null && count < position - 1) {
	                current = current.next;
	                count++;
	            }

	            if (current == null || current.next == null) {
	                append(data);
	                return;
	            }

	            newNode.next = current.next;
	            newNode.prev = current;
	            current.next.prev = newNode;
	            current.next = newNode;
	        }

	        void deleteAtPosition(int position) {
	            if (head == null) {
	                System.out.println("List is empty, nothing to delete.");
	                return;
	            }

	            if (position == 1) {
	                if (head.next == null) {
	                    head = tail = null;
	                } else {
	                    head = head.next;
	                    head.prev = null;
	                }
	                System.out.println("Node deleted at position 1");
	                return;
	            }

	            Node current = head;
	            int count = 1;
	            while (current != null && count < position) {
	                current = current.next;
	                count++;
	            }

	            if (current == null) {
	                System.out.println("Position out of range.");
	                return;
	            }

	            if (current.next == null) {
	                tail = current.prev;
	                tail.next = null;
	            } else {
	                current.prev.next = current.next;
	                current.next.prev = current.prev;
	            }
	            System.out.println("Node deleted at position " + position);
	        }

	        void traverseForward() {
	            if (head == null) {
	                System.out.println("List is empty.");
	                return;
	            }
	            Node current = head;
	            System.out.print("Forward traversal: ");
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }

	        void traverseBackward() {
	            if (tail == null) {
	                System.out.println("List is empty.");
	                return;
	            }
	            Node current = tail;
	            System.out.print("Backward traversal: ");
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.prev;
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        DoublyLinkedList dll = new DoublyLinkedList();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Doubly Linked List Menu ---");
	            System.out.println("1. Insert at end");
	            System.out.println("2. Insert at position");
	            System.out.println("3. Delete at position");
	            System.out.println("4. Traverse forward");
	            System.out.println("5. Traverse backward");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert at end: ");
	                    int valEnd = sc.nextInt();
	                    dll.append(valEnd);
	                    System.out.println(valEnd + " inserted at end.");
	                    break;

	                case 2:
	                    System.out.print("Enter value to insert: ");
	                    int valPos = sc.nextInt();
	                    System.out.print("Enter position to insert at (1-based): ");
	                    int pos = sc.nextInt();
	                    dll.insertAtPosition(valPos, pos);
	                    System.out.println(valPos + " inserted at position " + pos);
	                    break;

	                case 3:
	                    System.out.print("Enter position to delete (1-based): ");
	                    int delPos = sc.nextInt();
	                    dll.deleteAtPosition(delPos);
	                    break;

	                case 4:
	                    dll.traverseForward();
	                    break;

	                case 5:
	                    dll.traverseBackward();
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice, please try again.");
	            }

	        } while (choice != 6);

	        sc.close();
	    }
	}



