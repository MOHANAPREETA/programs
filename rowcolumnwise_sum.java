package first;
import java.util.*;
public class rowcolumnwise_sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int[][] arr=new int[2][2];
		 for(int i=0;i<2 ;i++)
		    {
		    	for(int j=0;j<2 ;j++)
		    	{
		    		arr[i][j]=sc.nextInt();
		    	}
		    }
		    for(int i=0;i<2 ;i++)
		    {
		    	int srow=0;
		    	for(int j=0;j<2;j++)
		    	{
		    	
		    		srow+=arr[i][j];}System.out.println("Row " + i + " sum = " + srow);
		    	
		    }System.out.println();
		    for(int j=0;j<2;j++)
		    {
		    	int scol=0;
		    	for(int i=0;i<2;i++)
		    	{
		    	
		    		scol+=arr[i][j];}System.out.println("col " + j + " sum = " + scol);
		    	
		    }
	}

}
