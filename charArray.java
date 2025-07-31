package first;
import java.util.*;
public class charArray {

	public static void main(String[] args) {
         Scanner b=new Scanner(System.in);
         String str=b.nextLine();
         char[] ch=str.toCharArray();
         for(char c:ch)
         {
        	 System.out.print(c+" ");
         }
         String x=new String(ch);
         System.out.println(x);
         


	}


}
