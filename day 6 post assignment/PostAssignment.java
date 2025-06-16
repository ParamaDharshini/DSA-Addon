package day6;

public class PostAssignment {
	
	
	    // Node class for singly linked list
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node top; // points to the top of the stack

	    public PostAssignment() {
	        top = null;
	    }

	    // Push element onto stack
	    public void push(int item) {
	        Node newNode = new Node(item);
	        newNode.next = top;
	        top = newNode;
	        System.out.println("Pushed " + item);
	    }

	    // Pop element from stack
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1; // or throw exception
	        }
	        int item = top.data;
	        top = top.next;
	        System.out.println("Popped " + item);
	        return item;
	    }

	    // Peek at top element without removing
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return top.data;
	    }

	    // Check if stack is empty
	    public boolean isEmpty() {
	        return top == null;
	    }

	    // For testing
	    public static void main(String[] args) {
	    	PostAssignment stack = new PostAssignment();

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Top element is " + stack.peek());

	        stack.pop();
	        stack.pop();
	        stack.pop();

	        stack.pop(); // Should print "Stack is empty"
	    }
	


}
