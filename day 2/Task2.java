package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int[] num = new int[n];

		System.out.println("Enter elements:");
		for (int i= 0;i<n;i++)
		{
		num[i] = sc.nextInt();
		}
		System.out.println("array 1:");
		System.out.println(Arrays.toString(num));
		System.out.println("array 2:");
		int [] num2 = new int[n];
		for(int i=0;i<n;i++)
		{
		num2[i]=num[i];
		}
		System.out.println(Arrays.toString(num2));
		int temp=0;
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
		if(num2[i]>num2[j])
		{
		temp=num2[i];
		num2[i]=num2[j];
		num2[j]=temp;
		}
		}
		}
		System.out.println("Descending order:");
		    System.out.println(Arrays.toString(num2));
		    sc.close();
		}
	    

}
