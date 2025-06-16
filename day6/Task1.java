package day6;

public class Task1 {
	
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
		//System.out.println(stack1.length);
		
	}
	
	/*public void pop()
	{
		stack1[top-1];
	}*/
	public int Pop(){

		 return stack1[top--];
		 }
	
	
	
	
	public static void main(String args[]) {
		
		Task1 s=new Task1();
		s.push(23);
		s.push(5);
		s.push(7);
		s.push(63);
		s.push(77);
		s.display();
		s.Pop();
		s.Pop();
		s.display();
		
		}
	
	


}
