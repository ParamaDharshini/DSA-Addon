package day4;

public class Task1_DLL {
	
	
	    
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
	            head = newNode;
	            tail = newNode;
	            return;
	        }

	        tail.next = newNode;  
	        newNode.prev = tail;  
	        tail = newNode;       
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
	        Task1_DLL dll = new Task1_DLL();

	        dll.append(10);
	        dll.append(50);
	        dll.append(80);
	        dll.append(20);

	        dll.traverseForward();    
	        dll.traverseBackward();   
	    }
	}



