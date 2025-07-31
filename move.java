package first;
import java.util.*;
public class move {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String str=b.nextLine();
		int n=str.length();
		moveHash(str,n);
}
	static void moveHash(String str,int n)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
		if(str.charAt(i)=='#')
			sb.append(str.charAt(i));}
		StringBuilder sb1=new StringBuilder();
		for(int j=0;j<n;j++) {
			if(str.charAt(j)!='#')
				sb1.append(str.charAt(j));
		
	}
		System.out.print(sb);System.out.print(sb1);}

}