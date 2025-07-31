package first;
import java.util.*;
public class sum_recursion {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int sum=sum_of_digits(x);
		System.out.println(sum);

	}
	static int sum_of_digits(int x)
	{
		if(x==0)
			return 0;
		return (x%10)+sum_of_digits(x/10);
		
		
		/*int s=0;
		while(x!=0)
		{
			s+=x%10;
		x/=10;}return s;*/
		
	}

}
