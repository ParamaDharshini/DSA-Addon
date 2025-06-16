package day6;

public class Task3 {
	

	     int[] arr;
	     int front;
	     int rear;
	     int capacity;

	    public Task3(int capacity) {
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
	        Task3 queue = new Task3(5);
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
	        queue.dequeue();
	        queue.enqueue(4);
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue(); // Queue is empty
	    }
	}



