package first;
import java.util.*;
import java.lang.String;
public class movechartolast {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String s=b.nextLine();
		String str=move(s);
		System.out.println(str);

	}
	static String move(String s)
	{
		if(s.length()<=1)
			return s;
		if(s.charAt(0)=='x')
	    	return move(s.substring(1))+'x';
	    else
	    	return s.charAt(0)+move(s.substring(1));
	}

}
