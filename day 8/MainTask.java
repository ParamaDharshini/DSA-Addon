package day8;

import java.util.Scanner;

public class MainTask { 
	
	    // Search method for integer array
	    public static int search(int[] nums, int target) {
	        int left = 0, right = nums.length -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] == target) return mid;

	            if (nums[left] <= nums[mid]) { // left half sorted
	                if (target >= nums[left] && target < nums[mid]) right = mid -1;
	                else left = mid + 1;
	            } else { // right half sorted
	                if (target > nums[mid] && target <= nums[right]) left = mid + 1;
	                else right = mid - 1;
	            }
	        }
	        return -1;
	    }

	    // Search method for string array
	    public static int search(String[] arr, String target) {
	        int left = 0, right = arr.length -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int cmpMid = arr[mid].compareTo(target);

	            if (cmpMid == 0) return mid;

	            if (arr[left].compareTo(arr[mid]) <= 0) { // left half sorted
	                if (target.compareTo(arr[left]) >= 0 && target.compareTo(arr[mid]) < 0) right = mid -1;
	                else left = mid + 1;
	            } else { // right half sorted
	                if (target.compareTo(arr[mid]) > 0 && target.compareTo(arr[right]) <= 0) left = mid + 1;
	                else right = mid - 1;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Example arrays (rotated sorted)
	        int[] nums = {4,5,6,7,0,1,2};
	        String[] words = {"kite", "lion", "monkey", "apple", "banana", "cat"};

	        System.out.print("Enter search target (int or string): ");
	        String input = sc.nextLine();

	        try {
	            int intTarget = Integer.parseInt(input);
	            int index = search(nums, intTarget);
	            if (index != -1) System.out.println("Found integer at index: " + index);
	            else System.out.println("Integer target not found.");
	        } catch (NumberFormatException e) {
	            // input is not an integer, treat as string
	            int index = search(words, input);
	            if (index != -1) System.out.println("Found string at index: " + index);
	            else System.out.println("String target not found.");
	        }

	        sc.close();
	    }
	

	
	

}
