package first;
import java.util.*;
public class diagonalsum {
	public static void main(String[] args) {
		int sumPrimary=0,sumSecondary=0;
		 int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		 int n=arr.length;
		 for (int i = 0; i < n; i++) {
		        sumPrimary += arr[i][i];
		        sumSecondary += arr[i][n - i - 1];
		    }
		 System.out.println("Primary Diagonal Sum: " + sumPrimary);
		    System.out.println("Secondary Diagonal Sum: " + sumSecondary);
	}

}
