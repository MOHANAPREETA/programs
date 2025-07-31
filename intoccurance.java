package first;
import java.util.*;
public class intoccurance {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr= new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=b.nextInt();
		}
		occurance(arr,x);}
	 
	static void occurance(int arr[],int x)
	{
		StringBuilder DC=new StringBuilder();int count=1;
        for (int i = 1; i <= x; i++) {
            if (i<x && arr[i] != arr[i-1]) 
            	 {
                    DC.append(arr[i]).append(count);
                    count = 1;
                } else {
                    count++;
                }
            System.out.printf("%d occurs %d\n",arr[i],count);}
	}
		

	

}
