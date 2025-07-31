package first;
import java.util.*;
public class fibnocciseries {

	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
		int x=b.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.print(fibnocci(i)+" ");
		}
	}
	static long fibnocci(int x)
	{
		if(x==0) {
			return 0;}
		else if(x==1) {
			return 1;}
		else {
			return fibnocci(x-1)+fibnocci(x-2);}
	}

}
