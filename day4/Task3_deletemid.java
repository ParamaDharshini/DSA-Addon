package day4;

public class Task3_deletemid { 
	
	

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

	    
	    public void deleteAtPosition(int position) {
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

	    /*public void traverseBackward() {
	        Node current = tail;
	        System.out.print("Backward traversal: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	        
	    }*/

	    public static void main(String[] args) {
	      Task3_deletemid dll = new Task3_deletemid();

	        dll.append(10);
	        dll.append(20);
	        dll.append(30);
	        dll.append(40);
	        dll.append(50);

	        System.out.println("Before deletion:");
	        dll.traverseForward();

	        
	        dll.deleteAtPosition(3);

	        System.out.println("After deletion:");
	        dll.traverseForward();
	        //dll.traverseBackward();
	    }
	}



