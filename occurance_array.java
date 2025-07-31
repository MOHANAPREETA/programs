package first;
import java.util.*;
public class occurance_array {
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=b.nextInt();
		}
		Occurance(arr);		
	}
	public static void Occurance(int[] arr)
	{ 
		 Arrays.sort(arr);
		    int c = 1;
		    for (int i = 0; i <=arr.length-1; i++) {
		        if ( arr[i] == arr[i + 1]) {
		            c++;
		        } else {
		            System.out.println(arr[i] + " occurs " + c + " times ");
		            c = 1;
		        }
		    }
		}}

