package first;
import java.util.*;
public class fibnocci {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);int a=0,c=1,next;
		int x=b.nextInt();int sum=0;
		  System.out.print (a + " , " + b + " , ");

		     
		       Fib (x - 2);
		   }

		   static int Fib (int n)
		   {
		     if (n > 0)
		       {
		      next = a + c;
		      a = c;
		      c= next;

		      System.out.print (next + " , ");
		      Fib (n - 1);
		       }
		     return 0;

		   }

		 }