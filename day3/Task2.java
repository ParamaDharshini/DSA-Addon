package day3;


public class Task2 {
	
	class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
  
	Node head;

 
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

     
        newNode.next = current.next;
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

    public static void main(String[] args) {
        Task2 list = new Task2();

      
        list.insertAtPosition(1, 0);  
        list.insertAtPosition(2, 1);  
        list.insertAtPosition(4, 2);  

        System.out.println("Before insertion:");
        list.traverse();

        list.insertAtPosition(3, 2); 
        list.insertAtPosition(5,1                                                   );

        System.out.println("After insertion:");
        list.traverse();
    }
}


