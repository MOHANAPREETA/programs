package first;

public class anagram {

	public static void main(String[] args) {
		String s1="hello";
		String s2="apple";
		if(s1.length()==s2.length()) {
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
		System.out.println(s1.substring(2));
	}

}
