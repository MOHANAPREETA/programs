package first;
import java.util.*;
public class gary_hike {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		String str=b.next();
		System.out.println(countsteps(x,str));
	}
	public static int countsteps(int x,String str)
	{
		int label=0,valley=0;
		for(int i=0;i<x;i++) {
		if(str.charAt(i)=='U') {
			label++;
		}
		else if(str.charAt(i)=='D'){
			if(label==1)
				valley++;
			label--;
		}}return valley;
	}}


