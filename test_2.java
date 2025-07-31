package first;
import java.util.*;
public class test_2 {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=b.nextInt();
		}
		int t=b.nextInt();
		System.out.println(binarysearch(arr,t));
	}
	public static int binarysearch(int[] arr,int t)
	{
		
		 int le = 0;
		    int r = arr.length - 1;
		    while (le <= r) {
		        int m = le + (r - le) / 2;
		        if (arr[m] == t) {
		            return m;
		        } else if (arr[m] < t) {
		            le = m + 1;
		        } else {
		            r = m - 1;
		        }

				
		}return -1;

	}

}
