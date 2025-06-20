package day7;

public class PostAss {
	
	

	    // Main function that sorts arr[l..r] using merge()
	    public static void mergeSort(int[] arr, int l, int r) {
	        if (l < r) {
	            // Find the middle point
	            int m = l + (r - l) / 2;

	            // Sort first and second halves
	            mergeSort(arr, l, m);
	            mergeSort(arr, m + 1, r);

	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }

	    // Merge two sorted subarrays arr[l..m] and arr[m+1..r]
	    public static void merge(int[] arr, int l, int m, int r) {
	        // Sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;

	        // Create temp arrays
	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        // Copy data to temp arrays
	        for (int i = 0; i < n1; i++)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; j++)
	            R[j] = arr[m + 1 + j];

	        // Merge the temp arrays back into arr[l..r]

	        int i = 0, j = 0;
	        int k = l;

	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of L[] if any
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of R[] if any
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {12, 11, 13, 5, 6, 7};
	        mergeSort(array, 0, array.length - 1);

	        System.out.print("Sorted array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	


}
