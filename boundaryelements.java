package first;

public class boundaryelements {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		 int n=arr.length;
		 int rows = arr.length;
		    int cols = arr[0].length;

		    for (int i = 0; i < cols; i++) 
			System.out.print(arr[0][i] + " "); // top row
		    for (int i = 1; i < rows - 1; i++) 
			System.out.print(arr[i][cols - 1] + " "); // right col
		    if (rows > 1) {
		        for (int i = cols - 1; i >= 0; i--) System.out.print(arr[rows - 1][i] + " "); // bottom row
		    }
		    for (int i = rows - 2; i > 0; i--) 
			System.out.print(arr[i][0] + " "); // left col
		}


	

}
