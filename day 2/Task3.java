package day2;

import java.util.Arrays;

public class Task3 {
	 public static void main(String[] args) {
	        int[] nums = {2, 3, 4, 4, 5, 8};
	        int[] result = removeDuplicates(nums);
	        System.out.println(Arrays.toString(result));
	    }
	    public static int[] removeDuplicates(int[] nums) {
	        int n = nums.length;
	        int[] temp = new int[n];
	        int newIndex = 0;
	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < newIndex; j++) {
	                if (nums[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                temp[newIndex++] = nums[i];
	            }
	        }
	        int[] result = Arrays.copyOf(temp, newIndex);
	        return result;
	    }

}
