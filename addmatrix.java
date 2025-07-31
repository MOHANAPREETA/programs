package first;
import java.util.*;
public class addmatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr1= {{1,2},{2,3}};
		int[][] arr2= {{1,4},{5,6}};
		int[][] sum = new int[arr1.length][arr2.length];
		int[][] multiply = new int[arr1.length][arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				multiply[i][j]=arr1[i][j]*arr2[i][j];
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
		}System.out.println();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(multiply[i][j]+" ");
			}
		}
		

	}

}
