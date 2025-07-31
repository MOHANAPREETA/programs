package first;
import java.util.*;
public class factors {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		factors(Math.abs(x));

	}
	static void factors(int x)
	
	{
		if(x==0)
		{
			System.out.println("No factors");
		}
		else {
		ArrayList  list=new ArrayList();
		for (int i = 1; i <= Math.sqrt(x); i++) {
		    if (x % i == 0) {
		        list.add(i);
		        if (i != x / i) {
		           list.add(x/i);
		        }
		    }
		}
		Collections.sort(list);
		System.out.print( list);}
	
		}
	}


