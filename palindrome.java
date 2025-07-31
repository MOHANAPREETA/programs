package first;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner b=new Scanner(System.in);
  int x=b.nextInt();int rev=0;
   int revnum=reverse(x,rev);
   if(revnum==x)
   {
	   System.out.println("palindrome");
   }
   else
   {
	   System.out.println(" Not palindrome");
   }
	}
	static int reverse(int x,int rev)
	{
		while (x > 0) {
	         rev = rev * 10 + x % 10;
	         x/= 10;
	     }
	     return rev;
	}

}
