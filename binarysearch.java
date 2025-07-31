package first;

import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		int result = Arrays.binarySearch(arr, 40);
		System.out.println("result "+result);
		
	}

}
