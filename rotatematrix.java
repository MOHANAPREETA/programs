package first;

public class rotatematrix {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		 int n=arr.length;
		 for (int i = 0; i < n; i++) {
		        for (int j = i; j < n; j++) {
		            int temp = arr[i][j];
		            arr[i][j] = arr[j][i];
		            arr[j][i] = temp;
		        }
		    }
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0,k=n-1;j<k;j++,k--)
			 {
				 int temp=arr[i][j];
				 arr[i][j]=arr[i][k];
				 arr[i][k]=temp;
			 }
		 }
		 for (int[] row : arr) {
		        for (int val : row)
		            System.out.print(val + " ");
		        System.out.println();
		    }
		}


	}


