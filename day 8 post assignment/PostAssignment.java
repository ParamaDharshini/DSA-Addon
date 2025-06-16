package day8;

public class PostAssignment {
	
	
	

	    // Find first occurrence of target in sorted array
	    public static int firstOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                right = mid - 1;  // go left to find earlier occurrence
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    // Find last occurrence of target in sorted array
	    public static int lastOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                left = mid + 1;  // go right to find later occurrence
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    // Calculate frequency of target
	    public static int frequencyCount(int[] arr, int target) {
	        int first = firstOccurrence(arr, target);
	        if (first == -1) return 0;  // target not found

	        int last = lastOccurrence(arr, target);
	        return last - first + 1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6};
	        int target = 2;

	        int freq = frequencyCount(arr, target);
	        System.out.println("Frequency of " + target + " is: " + freq);
	    }
	


}
