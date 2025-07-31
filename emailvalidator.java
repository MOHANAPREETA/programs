package first;
import java.util.*;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class emailvalidator {
	public static boolean isValid(String email) {
	String ER="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@"+
			"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
				Pattern p=Pattern.compile(ER);
				return email != null && p.matcher(email).matches();}


	public static void main(String[] args) {
		ArrayList<String> e=new ArrayList<>();
		e.add("review-team@sixphrase.com");
		e.add("writing.capgemini.org");
	    for(String email:e) {
	    	System.out.println(email+":"+(isValid(email)?"Yes":"No"));
	    }
		
	}
	

}
