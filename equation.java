package first;
import java.util.*;
public class equation {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		int c=b.nextInt();
		System.out.println(formula(a,c));}
	static double formula(int a,int c)
	{
		double result = Math.pow(a, 3) + 3 * Math.pow(a, 2) * c + 3 * a * Math.pow(c, 2) + Math.pow(c, 3);
		return result;

	}
		

	

}
