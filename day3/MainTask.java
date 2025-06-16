package day3;

public class MainTask {
	
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
	            return;
	        }

	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

	    
	    public void traverse() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;

	        while (current != null) {
	            next = current.next;  
	            current.next = prev;  
	            prev = current;       
	            current = next;       
	        }

	        head = prev;  
	    }

	    public static void main(String[] args) {
	       MainTask list = new MainTask();

	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);

	        System.out.println("Original List:");
	        list.traverse();

	        list.reverse();

	        System.out.println("Reversed List:");
	        list.traverse();
	    }
	}


