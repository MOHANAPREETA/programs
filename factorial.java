package first;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		System.out.println(factorial(x));

	}
	static int factorial(int x)
	{
		if(x==0)
			return 1;
		return x*factorial(x-1);
	}

}
