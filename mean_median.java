package first;
import java.util.*;
public class mean_median {

	public static void main(String[] args) {
		 int[] arr1 = {2, 3, 5, 7, 11};
	        int[] arr2 = {1,2,3, 4, 8};

	        System.out.println(isSpecialArray(arr1));  // Output: true
	        System.out.println(isSpecialArray(arr2));  // Output: false

	}
	 public static String isSpecialArray(int[] arr) {
		 StringBuilder sb=new StringBuilder();
	        if (arr == null || arr.length == 0) 
	        	sb.append(0);

	        int n = arr.length;

	        // Calculate mean
	        double sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        double mean = sum / n;

	        // Calculate median
	        Arrays.sort(arr);
	        double median;
		        if (n % 2 == 1) {
	            median = arr[n / 2];
	        } else {
	            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
	        }
	       
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(Math.abs(arr[i] - median) <= mean)
	        		
	        		sb.append(1);
	        	else {
	        		
	        		sb.append(0);}
	        }return sb.toString();

	       
	    }


}
