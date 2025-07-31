package first;
import java.util.*;
public class courses {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("Enter no of courses:");
		int x=b.nextInt();
		System.out.println("Enter the course names:");
		String[] s=new String[x];
		for(int i=0;i<x;i++)
		{
			s[i]=b.next();
		}
	    System.out.println("Enter the course to be searched");
	    String string=b.next();int c=1;
		for(int i=0;i<x;i++)
		{
		if(s[i].compareTo(string) == 0) {
			c=1;
			}
		else 
		{
			c=0;
		}
		if(c==1)
			System.out.println("course available");
	
		
		}
	}

}
