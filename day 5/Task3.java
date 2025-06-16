package Day5;

public class Task3 {
	
	
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;

	    public Task3() {
	        tail = null;
	    }

	    // Insert at tail for testing
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

	    // Delete from head (remove first node)
	    public void deleteFromHead() {
	        if (tail == null) {
	            System.out.println("List is empty. Nothing to delete.");
	            return;
	        }

	        Node head = tail.next;

	        if (head == tail) {
	            // Only one node in the list
	            tail = null;
	        } else {
	            // More than one node
	            tail.next = head.next;
	        }

	        System.out.println("Deleted from head: " + head.data);
	    }

	    // Display the list
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
	        Task3 cll = new Task3();

	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);

	        cll.display();

	        cll.deleteFromHead();
	        cll.display();

	        cll.deleteFromHead();
	        cll.display();

	        cll.deleteFromHead();
	        cll.display();

	        cll.deleteFromHead();
	        cll.display();

	        cll.deleteFromHead();  // deleting from empty list
	    }
	


}
