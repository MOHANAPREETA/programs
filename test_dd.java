package first;
import java.util.*;
public class test_dd {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=b.nextInt();
		}
		int t=b.nextInt();
		System.out.println(linearsearch(arr,t));
	}
	public static int linearsearch(int[] arr,int t)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==t)
				
				return i;
				
		}return -1;
	}

}
