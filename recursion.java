package first;
import java.util.*;
public class recursion {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		long num=factorial(x);
		System.out.print(num);

	}
	static int factorial(int x) {
		if(x==0||x==1)
			return 1;
		else
			return x*factorial(x-1);
		
	}

}
