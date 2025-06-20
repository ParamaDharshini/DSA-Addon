package day7;

public class Task2_Quick {
	
	

	    // The main function that implements QuickSort
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // pi is partitioning index, arr[pi] is now at the right place
	            int pi = partition(arr, low, high);

	            // Recursively sort elements before and after partition
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    // This function takes the last element as pivot,
	    // places the pivot element at its correct position in sorted array,
	    // and places all smaller to left of pivot and all greater elements to right
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1; // index of smaller element

	        for (int j = low; j < high; j++) {
	            // If current element is smaller than or equal to pivot
	            if (arr[j] <= pivot) {
	                i++;

	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {
	        int[] array = {10, 7, 8, 9, 1, 5};
	        quickSort(array, 0, array.length - 1);

	        System.out.print("Sorted array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	


}
