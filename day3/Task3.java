package day3;

public class Task3 {
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

	    
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	       
	        if (position == 0) {
	            head = head.next;
	            return;
	        }

	        Node current = head;
	        int count = 0;

	        
	        while (current != null && count < position - 1) {
	            current = current.next;
	            count++;
	        }

	        
	        if (current == null || current.next == null) {
	            System.out.println("Position out of bounds");
	            return;
	        }

	       
	        current.next = current.next.next;
	    }

	    
	    public void traverse() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Task3 list = new Task3();


	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        System.out.println("Original List:");
	        list.traverse();

	        
	        list.deleteAtPosition(2);
	        System.out.println("After deleting at position 2:");
	        list.traverse();

	        
	        list.deleteAtPosition(0);
	        System.out.println("After deleting head (position 0):");
	        list.traverse();

	        
	        list.deleteAtPosition(10); 
	    }
	}



