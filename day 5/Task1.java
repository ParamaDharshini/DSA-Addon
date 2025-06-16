package Day5;

public class Task1 {
	
	
	    // Node class
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;  // We'll keep a tail pointer for easy insertion

	    public Task1() {
	        tail = null;
	    }

	    // Insert a new node at the end
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            // List is empty, new node points to itself
	            tail = newNode;
	            tail.next = newNode;
	        } else {
	            newNode.next = tail.next; // new node points to head
	            tail.next = newNode;      // old tail points to new node
	            tail = newNode;           // update tail to new node
	        }
	    }

	    // Display the circular linked list
	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node current = tail.next; // head node
	        do {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != tail.next);
	        System.out.println("(back to head)");
	    }

	    public static void main(String[] args) {
	        Task1 cll = new Task1();

	        cll.insert(10);
	        cll.insert(20);
	        cll.insert(30);
	        cll.insert(40);

	        cll.display();
	    }
	


}
