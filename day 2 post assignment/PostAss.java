package day2;

public class PostAss {
	 public static void main(String[] args) {
	       int[] nums = {4, 5, 2, 6, 9, 10};
	       int target = 8;
	       findTwoSum(nums, target);
	   }
	   public static void findTwoSum(int[] nums, int target) {
	       for (int i = 0; i < nums.length; i++) {
	           for (int j = i + 1; j < nums.length; j++) {
	               if (nums[i] + nums[j] == target) {
	                   System.out.println("Pair found: " + nums[i] + " + " + nums[j] + " = " + target);
	                   return;
	               }
	           }
	       }
	       System.out.println("No pair found with the target sum.");
	   }

}
