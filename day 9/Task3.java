package day9;

public class Task3 {
	
	

	    public static int lowerBound(int[] arr, int x) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] < x) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

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

	    public static int countOccurrences(int[] arr, int target) {
	        int lower = lowerBound(arr, target);
	        int upper = upperBound(arr, target);
	        return upper - lower;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 3, 5,5, 7};
	        int target = 5;
	        int count = countOccurrences(arr, target);
	        System.out.println("Target " + target + " appears " + count + " times.");
	    }
	


}
