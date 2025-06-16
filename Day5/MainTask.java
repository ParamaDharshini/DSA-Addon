package Day5;

public class MainTask {
	
	
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;

	    public  MainTask() {
	        tail = null;
	    }

	    // Insert at tail (for testing)
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

	    // Delete node at given position (1-based index)
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

	        // If deleting the head (position 1)
	        if (position == 1) {
	            if (head == tail) { // only one node
	                System.out.println("Deleted: " + head.data);
	                tail = null;
	            } else {
	                System.out.println("Deleted: " + head.data);
	                tail.next = head.next;
	            }
	            return;
	        }

	        // Deleting other positions
	        Node current = head;
	        Node prev = null;
	        int count = 1;

	        // Traverse to the node just before the one to delete
	        while (count < position && current != tail) {
	            prev = current;
	            current = current.next;
	            count++;
	        }

	        if (count != position) {
	            System.out.println("Position out of bounds.");
	            return;
	        }

	        // Now current is the node to delete
	        System.out.println("Deleted: " + current.data);
	        prev.next = current.next;

	        // If deleting the tail node, update tail
	        if (current == tail) {
	            tail = prev;
	        }
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
	        MainTask cll = new MainTask();

	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);
	        cll.insertAtTail(50);

	        cll.display();

	        cll.deleteAtPosition(1);  // delete head
	        cll.display();

	        cll.deleteAtPosition(3);  // delete last node (current tail)
	        cll.display();

	        cll.deleteAtPosition(2);  // delete middle node
	        cll.display();

	        cll.deleteAtPosition(10); // invalid position
	    }
	


}
