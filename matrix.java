package first;
import java.util.*;


public class matrix {

	public static void main(String[] args) {
    Scanner b=new Scanner(System.in);
    int x=b.nextInt();
    int y=b.nextInt();
    int[][] arr=new int[x][y];
    for(int i=0;i<x;i++)
    {
    	for(int j=0;j<y;j++)
    	{
    		arr[i][j]=b.nextInt();
    	}
    }

    for(int i=0;i<x;i++)
    {
    	for(int j=0;j<y;j++)
    	{
    		System.out.print(arr[i][j]+" ");
    	}
    }
    int top = 0, bottom = x - 1;
    int left = 0, right = y - 1;

    System.out.println("Spiral order of matrix:");
    while (top <= bottom && left <= right) {
        for (int i = left; i <= right; i++) {
            System.out.print(arr[top][i] + " ");
        }
        top++;

        for (int i = top; i <= bottom; i++) {
            System.out.print(arr[i][right] + " ");
        }
        right--;

        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
        }

        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
    }


	}

}
