package Day5;

public class Task2 {
	
	
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;

	    public Task2() {
	        tail = null;
	    }

	    // Insert a new node at the tail (end)
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            // Empty list: newNode points to itself
	            tail = newNode;
	            tail.next = newNode;
	        } else {
	            // newNode points to head (tail.next)
	            newNode.next = tail.next;
	            // old tail points to newNode
	            tail.next = newNode;
	            // update tail to newNode
	            tail = newNode;
	        }
	    }

	    // Display the list
	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node current = tail.next; // head
	        do {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != tail.next);
	        System.out.println("(back to head)");
	    }

	    public static void main(String[] args) {
	        Task2 list = new Task2();

	        list.insertAtTail(5);
	        list.insertAtTail(10);
	        list.insertAtTail(15);
	        list.insertAtTail(20);

	        list.display();
	    }
	


}
