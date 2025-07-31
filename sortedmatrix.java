package first;

public class sortedmatrix {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		 int n=arr.length;
		 int key=7;
		 int row = 0, col = arr[0].length - 1;

		    while (row < arr.length && col >= 0) {
		        if (arr[row][col] == key) {
		            System.out.println("Found at: (" + row + ", " + col + ")");
		            return;
		        } else if (arr[row][col] > key) {
		            col--;
		        } else {
		            row++;
		        }
		    }
		    System.out.println("Element not found.");
		}


	}


