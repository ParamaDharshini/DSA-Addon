package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		int n;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n:");
		n=sc.nextInt();
		int[] num=new int[n];
		int i;
		System.out.println("Enter n value:");
		for(i=0;i<n;i++)
		{
		num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		/*int number=sc.nextInt();
		int number1[]=new int[n+1];
		for(i=0;i<n;i++) {
		number1[i]=num[i];
		
		
		}
		
		number1[n]=number;
		System.out.println(Arrays.toString(number1));*/
		
		sc.close();
		
		}
	
	

}
