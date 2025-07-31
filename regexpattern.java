package first;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regexpattern {
	public static void main(String[]args)
	{
     try(Scanner b=new Scanner(System.in)){
    	 while(true)
    	 {
    		 System.out.println("Enter the regex pattern");
    		 String regexpattern = b.nextLine();
    		 Pattern pattern=Pattern.compile(regexpattern);
    		 Matcher matcher=pattern.matcher("Welcome to capgemini");
    		 boolean found =false;
    		 while(matcher.find())
    		 {
    			 System.out.println("Found the text"+matcher.group()
    			 +"starting index"+matcher.start()+"and ending index"+matcher.end());
    			 found=true;
    			 
    		 }
    		 if(!found)
    			 System.out.println("Match not found");
    	 }
     }
	}

}
