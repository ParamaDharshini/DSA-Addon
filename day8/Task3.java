package day8;

public class Task3 {
	
	

	    public static int search(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid;
	            }

	            // Check if the left half is sorted
	            if (nums[left] <= nums[mid]) {
	                // If target is in the range of the sorted left half
	                if (target >= nums[left] && target < nums[mid]) {
	                    right = mid - 1; // search left half
	                } else {
	                    left = mid + 1;  // search right half
	                }
	            } else {
	                // Right half is sorted
	                if (target > nums[mid] && target <= nums[right]) {
	                    left = mid + 1;  // search right half
	                } else {
	                    right = mid - 1; // search left half
	                }
	            }
	        }

	        return -1; // target not found
	    }

	    // Example usage
	    public static void main(String[] args) {
	        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
	        int target = 0;
	        int index = search(nums, target);

	        if (index != -1) {
	            System.out.println("Target " + target + " found at index " + index);
	        } else {
	            System.out.println("Target " + target + " not found in array.");
	        }
	    }
	


}
