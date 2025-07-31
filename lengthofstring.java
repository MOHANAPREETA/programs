package first;
import java.util.*;
import java.lang.String;
public class lengthofstring {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String s=b.nextLine();
		int l=length(s);
		System.out.println(l);

	}
	static int length(String str)
	{
		if(str.isEmpty()) {
			return 0;
		}
		else {
			return 1+length(str.substring(1));
		}
	}

}
