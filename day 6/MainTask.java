package day6;

public class MainTask {
	
	
		

	     int[] arr;
	     int front;
	     int rear;
	     int capacity;

	    public MainTask(int capacity) {
	        this.capacity = capacity;
	        arr = new int[capacity];
	        front = 0;
	        rear = 0;
	    }

	    // Add element to the queue
	    public void enqueue(int item) {
	        if (rear == capacity) {
	            System.out.println("Queue is full");
	            return;
	        }
	        arr[rear] = item;
	        rear++;
	        System.out.println("Enqueued " + item);
	    }

	    // Remove element from the queue
	    public int dequeue() {
	        if (front == rear) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        int item = arr[front];
	        front++;

	        // Optional: shift elements to front after dequeue for simplicity
	        if (front == rear) {
	            // Reset pointers if queue is empty
	            front = 0;
	            rear = 0;
	        }

	        System.out.println("Dequeued " + item);
	        return item;
	    }

	    public boolean isEmpty() {
	        return front == rear;
	    }

	    public static void main(String[] args) {
	        MainTask queue = new MainTask(5);
	        queue.enqueue(5);
	        queue.enqueue(12);
	        queue.enqueue(35);
	        queue.dequeue();
	        queue.enqueue(68);
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue(); // Queue is empty
	    }
	





}
