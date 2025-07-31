package first;
import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String str=b.nextLine();
		 int[] charCount = new int[256];
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (charCount[c] == 1) {
	                System.out.println("The earliest repeating character is: " + c);
	                return;
	            }
	            charCount[c]++;
	        }

	        System.out.println("No repeating character found.");




	}

}
