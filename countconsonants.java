package first;
import java.util.*;
import java.lang.String;
public class countconsonants {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String s=b.nextLine();
		int l=count(s.toLowerCase());
		System.out.println(l);
	}
	static int count(String s)
	{
		if(s.isEmpty()) { 
			return 0;}char c=s.charAt(0);
		if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
			return 1 + count(s.substring(1));}
		else {
			return  count(s.substring(1));
		}
		}


}
