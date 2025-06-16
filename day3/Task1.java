package day3;



public class Task1 {
	
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	
	    Node head;

	    
	    public void insert(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    
	    public void traverse() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        Task1 list = new Task1();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(25);

	        System.out.println("Linked list contents:");
	        list.traverse();
	    }
	}



