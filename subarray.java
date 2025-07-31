package first;
import java.util.*;
public class subarray {
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=b.nextInt();
		}
		int k=b.nextInt();
		finding_array(arr,k);
	}
	public static void finding_array(int[]arr,int k)
	{
		int max=Integer.MIN_VALUE,s=0;
		for(int i=0;i<arr.length;i++)
		{
			s+=arr[i];
			if(i>=k)
				s-=arr[i-k];
			if(i>=k-1)
				max=Math.max(max, s);
				
		}System.out.println("sum"+max);
		
	}

}
