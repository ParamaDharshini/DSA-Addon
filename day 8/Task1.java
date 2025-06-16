package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String args[]) {
		
		int arr[]= {12,3,5,67,1,90,34};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your target:");
		int find=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				System.out.println("value found at index:"+i);
				flag=true;
				return;
			}
		}
		if(flag==false) {
			System.out.println("Value not found");
		}
		sc.close();
	}
}
