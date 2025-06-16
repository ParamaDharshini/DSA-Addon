package day4;

public class Task2_mid {
	
	

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

	    Node head;
	    Node tail;

	    
	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = tail = newNode;
	            return;
	        }
	        tail.next = newNode;
	        newNode.prev = tail;
	        tail = newNode;
	    }

	    
	    public void insertAtPosition(int data, int position) {
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

	    public void traverseForward() {
	        Node current = head;
	        System.out.print("Forward traversal: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void traverseBackward() {
	        Node current = tail;
	        System.out.print("Backward traversal: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Task2_mid dll = new Task2_mid();

	        dll.append(10);
	        dll.append(20);
	        dll.append(40);
	        System.out.println("Before insertion:");
	        dll.traverseForward();

	        
	        dll.insertAtPosition(30, 3);

	        System.out.println("After insertion:");
	        dll.traverseForward();
	        dll.traverseBackward();
	    }
	}



