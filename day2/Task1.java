package day2;


public class Task1 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Reversed array:");
        printArray(arr);
    }

   
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
           
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

   
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
