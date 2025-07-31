package first;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();int c=0;
		while(x<2)
		{
			System.out.println("The given number is not prime");
		}
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
				c++;
				
		}
		if(c>2)
		{
			System.out.println("The given number"+x+"is not a prime number");
		}
		else
		{
			System.out.println("The given number "+x+" is  a prime number");
		}

	}

}
