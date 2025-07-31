package first;
import java.util.*;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;
public class matrix_table {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
    int[][] arr=new int[3][3];
    int[][] transposearr=new int[3][3];
    int c=0;
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    		arr[i][j]=sc.nextInt();
    	}
    }int key=sc.nextInt();
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    		if(arr[i][j]==key)
    			c++;
    	}

	} if(c==1)
    	System.out.println("found");
    else
    	System.out.println("not found");
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    		transposearr[i][j]=arr[j][i];
    	}

	}
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    		System.out.print(transposearr[i][j]+" ");
    	}

	}
   

}}
