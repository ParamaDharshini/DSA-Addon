package day1;

public class Task2_maxmin {
	public static void main(String[] args) {
	       int[] arr = {3, 5, 7, 2, 8, 1, 4, 10};
	       int max = arr[0];
	       int min = arr[0];
	       for (int num : arr) {
	           if (num > max) max = num;
	           if (num < min) min = num;
	       }
	       System.out.println("Maximum: " + max);
	       System.out.println("Minimum: " + min);
	   }

}
