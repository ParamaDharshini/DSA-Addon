package day6;

import java.util.Scanner;

public class Task2 {
	
	int[] stack1=new int[5];
	int top=-1;
	
	public void push(int val) {
		/*if(top<9)
		{
			stack1[++top]=val;
		}
		else
		{
			System.out.println("Stack Overflow");
		}*/
		stack1[++top]=val;
		if(top==5 ) {
			System.out.println("Stack Overflow:");
		}
	}
	void display() {
		for(int i=0;i<=top;i++)
		System.out.print(stack1[i]+" "); 
		System.out.println();
		
	}
	
	/*public void pop()
	{
		stack1[top-1];
	}*/
	public int pop(){

		 return stack1[top--];
		 }
	
	public int peek() {
		System.out.println(stack1[top]);
		return 0;
	}
	
	public static void main(String[] args) {
        Task2 sp = new Task2();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4.Peek");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    sp.push(value);
                    break;
                case 2:
                    sp.pop();
                    break;
                case 3:
                    sp.display();
                    break;
                case 4:
                	sp.peek();
                	System.out.println("Top Element:");
                	break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }


}
