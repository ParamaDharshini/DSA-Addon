package day1;

import java.util.Scanner;

public class Task3_fibonnaci {
	public static int fibonacci(int n) {
        if (n <= 1) {
        	//System.out.println(n);
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }

}
