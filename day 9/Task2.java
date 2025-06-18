package day9;

public class Task2 {
	
	
	    public static int upperBound(int[] arr, int x) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] <= x) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 5, 7};
	        int x = 3;
	        int index = upperBound(arr, x);
	        System.out.println("Upper bound of " + x + " is at index: " + index);
	    }
	


}
