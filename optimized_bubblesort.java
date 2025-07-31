package first;
import java.util.*;
public class optimized_bubblesort {
	public static void bubblesort(int[] array) {
		int n=array.length;int c=0;
		for(int i=0;i<n;i++)
		{
			boolean swap=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
				  int temp=array[j];
				  array[j]=array[j+1];
				  array[j+1]=temp;
				  swap=true;c++;
				}
			}
			if(!swap) {
				break;
			}
		}
		System.out.println("No of iterations: "+c);
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,2,1,4,5,6};
		bubblesort(arr);
	}
}
