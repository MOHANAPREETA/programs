package first;
import java.util.*;
public class matrixuppertriangle {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		 int n=arr.length;
		 System.out.println("Upper triangle");
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if(i<=j)
					 System.out.print(arr[i][j] + " ");
			     else
			         System.out.print("  ");
			 }System.out.println();
		 }
		  System.out.println("Lower Triangle:");
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < n; j++) {
		            if (i >= j)
		                System.out.print(arr[i][j] + " ");
		            else
		                System.out.print("  ");
		        }
		        System.out.println();
		    }
		}

	}


