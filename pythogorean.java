package first;
import java.util.*;
public class pythogorean {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int l=b.nextInt();
		calculate(l);
	}
	public static void calculate(int l)
	{
		for(int i=0;i<=l;i++)
		{
			for(int j=0;j<=l;j++)
			{
				for(int k=0;k<=l;k++)
				{
					if (i > 0 && j > 0 && k > 0 && i < j && j < k && (i * i) + (j * j) == (k * k))
						System.out.println(i+" "+j+" "+k);
				}
			}
			
		}
	}

}
