/*package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	
	
	public static void main(String args[]) {
		
		Task2 bin=new Task2();
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6};
		Arrays.sort(arr);
		boolean flag=false;
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		int left=0,mid;
		int right=arr.length;
		
		while(left<=right) {
			mid=(left+right)/2;
			  
			if(arr[mid]==target) {
				
				System.out.println("Value "+arr[mid] + " found at index" +mid);
				flag=true;
				break;
				
			}
			
			else if(arr[mid]>target) {
				right=mid-1;
			}
			else  {
				left=mid+1;
			}
		}
		
		
		
		
		

	if(!flag) {
		System.out.println("value not found");
	}
	
	sc.close();
	}

}
*/


package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String args[]) {

        Task2 bin = new Task2();
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};

        Arrays.sort(arr);  // not necessary here, but okay for safety

        boolean flag = false;
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int left = 0, right = arr.length - 1, mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Value " + arr[mid] + " found at index " + mid);
                flag = true;
                break;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1; // ✅ fix this line
            }
        }

        if (!flag) {
            System.out.println("Value not found");
        }

        sc.close();
    }
}

