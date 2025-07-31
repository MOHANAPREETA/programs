package first;

public class exception {

	public static void main(String[] arr) {
		int sum=0;
		try {
			for(String s: arr) {
				int num=Integer.parseInt(s);
				sum+=num;
			}
			int n=10/0;
			System.out.println("Division"+n);
		}
		catch(NumberFormatException nf)
		{
			System.err.println("Please enter digits");
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
		}
		finally {
			System.out.println("This block must executes");
		}System.out.println("Sum "+sum);

	}

}
