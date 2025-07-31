package first;
import java.util.*;
public class spiralprinting {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int[][] arr=new int[3][3];
		 for(int i=0;i<3;i++)
		    {
		    	for(int j=0;j<3;j++)
		    	{
		    		arr[i][j]=sc.nextInt();
		    	}
		    }
		 int top=0,left=0,bottom=arr.length-1,right=arr[0].length-1;
		 while(top<=bottom&&left<=right)
		 {
			 for(int i=left;i<=right;i++)
			 {
				 System.out.println(arr[top][i]+" ");}
				 top++;
			 
			 for(int i=top;i<=bottom;i++)
				 System.out.println(arr[i][right]+" ");
			 right--;
			 if(top<=bottom) {
				 for(int i=right;i>=left;i--)
					 System.out.println(arr[bottom][i]+" ");
				 bottom--;
			 }
			 if(left<=right)
			 {
				 for(int i=bottom;i>=top;i--)
				 {
					 System.out.println(arr[i][left]+" ");}
					 left++;
				 
			 }
		 }
		

	}

}
