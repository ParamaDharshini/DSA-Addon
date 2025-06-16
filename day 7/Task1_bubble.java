package day7;

public class Task1_bubble {
	
	
	
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            // Last i elements are already sorted
	            for (int j = 0; j < n - i - 1; j++) {
	                // Swap if the current element is greater than the next element
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {64, 34, 25, 12, 22, 11, 90};
	        bubbleSort(array);
	        System.out.print("Sorted array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	

	

}
