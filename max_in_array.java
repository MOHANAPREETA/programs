package first;
import java.util.*;
public class max_in_array {

	public static void main(String[] args) {
		Scanner b=new Scanner (System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=b.nextInt();
		}
		int max=maximum(arr);
		System.out.println(max);

	}
	static int maximum(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}return max;
	}
	}


