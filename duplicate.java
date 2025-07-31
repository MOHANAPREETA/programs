package first;
import java.util.*;
class DuplicateNumberException extends Exception{
	public DuplicateNumberException(String message){
		super(message);
	}}

public class duplicate {
	public static void checkforduplicate(int[] arr) throws  DuplicateNumberException
	{
		 // Arrays.sort(arr);
		    for (int i = 0; i < arr.length - 1; i++) {
		      if (arr[i] == arr[i + 1]) {
		        throw new DuplicateNumberException("it contains duplicates");
		      }
		    }
		    System.out.println("it does not contains duplicates.");
		  }
	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
		 int n = b.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = b.nextInt();
		    }
	    try {
	    	checkforduplicate(arr);
	    }
	    catch(DuplicateNumberException e){
	    	System.out.println(e.getMessage());
	    }
		

	}



	
}
	


