package first;
import java.util.*;
public class kth_element {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
	   String str="hello0uu";
	   //int k=b.nextInt();
	   System.out.println(repeating(str));}
	static Character repeating(String str) {
	   int c=0;
	   while(c<1) {
	   for(int i=0;i<str.length();i++)
	   {
		   for(int j=0;j<i;j++)
		   {
			  if( str.charAt(i)==str.charAt(j))
				  c++;
			      
			  
		   }
		   if(c>1)
			   System.out.println(str.charAt(i));}
		   
	   
	}
	   return null;
	}
}
