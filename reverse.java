package first;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner b=new Scanner(System.in);
 int x=b.nextInt();
 System.out.println(reverseDigits(x));}
 static int reverseDigits(int n) {
     int rev = 0;
     while (n > 0) {
         rev = rev * 10 + n % 10;
         n/= 10;
     }
     return rev;
 }
}
