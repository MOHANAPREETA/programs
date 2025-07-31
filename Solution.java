package first;
import java.util.*;
class Solution{
	public static int maxPassengers(int[][]grid)
	{
		int n=grid.length;
		int [][][] dp=new int[n][n][n];		
		for(int[][]row:dp) 
			for(int[]col:row) 
				java.util.Arrays.fill(col,Integer.MIN_VALUE);
				dp[0][0][0]=grid[0][0];
				for(int x1=0;x1<n;x1++) {
					for(int y1=0;y1<n;y1++) {
						
						for(int x2=0;x2<n;x2++) {
							int y2=x1+y1-x2;
						if(y2<0||y2>=n||grid[x1][y1]==-1||grid[x2][y2]==-1) 
							continue;
							int val=grid[x1][y1];
							if(x1!=x2||y1!=y2)val+=grid[x2][y2];
							int max=dp[x1][y1][x2];
							if(x1>0&&x2>0)max=Math.max(max, dp[x1-1][y1][x2-1]);
							if(x1>0&&y2>0)max=Math.max(max,dp[x1-1][y1][x2]);
							if(y1>0&&x2>0)max=Math.max(max,dp[x1][y1-1][x2-1]);
							if (y1 > 0 && y2 > 0) max = Math.max(max, dp[x1][y1 -1][x2]);                                                    
							dp[x1][y1][x2] = max + val; 
						}
						}
					}return Math.max(0, dp[n - 1][n - 1][n - 1]); 
				} 
			
		
	public static void main(String[]args)
	{
		Scanner b=new Scanner(System.in);
		int m=b.nextInt();
		int n=b.nextInt();
		int[][] grid=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				grid[i][j]=b.nextInt();
			}
		}System.out.println(maxPassengers(grid));
	}
}


/*4  

4 

0 0 0 1 

1 0 0 0

0 0 0 0

0 0 0 0*/