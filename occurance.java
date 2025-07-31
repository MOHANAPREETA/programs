package first;
import java.util.*;
public class occurance {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String str=b.nextLine();
		compressedstring(str);
		}
	static void  compressedstring(String str) {
		StringBuilder DC=new StringBuilder();int count=1;
        for (int i = 1; i <= str.length(); i++) {
            if (i<str.length() && str.charAt(i) != str.charAt(i - 1)) 
            	 {
                    DC.append(str.charAt(i - 1)).append(count);
                    count = 1;
                } else {
                    count++;
                }}
            System.out.printf("%s,%d",DC,count);
            


		
		
	}

}
