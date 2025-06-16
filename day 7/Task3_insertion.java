package day7;

public class Task3_insertion {
	
	

	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;

	            // Move elements of arr[0..i-1], that are greater than key,
	            // one position ahead to make space for key
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {12, 11, 13, 5, 6};
	        insertionSort(array);

	        System.out.print("Sorted array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	


}
