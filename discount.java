package first;
import java.util.*;
public class discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			String str=sc.nextLine();
			String[] s=str.split(",");
			System.out.println(s[i]);
		}
		
	}

}
