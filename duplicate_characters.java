package first;
import java.util.*;
import java.lang.String;
public class duplicate_characters {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String str=b.nextLine();
		String s=remove(str);
		System.out.println(s);
	}
	static String remove(String str)
	{
		if(str.length()<=1)
			return str;
	    if(str.charAt(0)==str.charAt(1))
	    	return remove(str.substring(1));
	    else
	    	return str.charAt(0)+remove(str.substring(1));
	}

}
