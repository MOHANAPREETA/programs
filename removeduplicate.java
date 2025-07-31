package first;

public class removeduplicate {

	public static void main(String[] args) {
		String str="hello";
		for(int i=0;i<str.length();i++)
		{
		
			if(str.charAt(i)==str.charAt(i+1))
			{
				continue;
			}else
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
