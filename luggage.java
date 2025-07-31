package first;
import java.util.*;
public class luggage {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=b.nextInt();
		}
		int t=b.nextInt();
		System.out.println(weight(arr,t));
		}
	public static int weight(int[]arr,int t) {
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=t)
				s+=1;
			else
				s+=2;	
		}return s;}
		
		

	

}
