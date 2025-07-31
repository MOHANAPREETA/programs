package first;
import java.util.*;

	class NoVowelException extends Exception{
	public NoVowelException(String message){
		super(message);  // calls parent class
	}
	}

public class exception_string {
	public static void checkforvowels(String str) throws NoVowelException
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				throw new NoVowelException("Error - The String  contain Vowel");}
			
			else
			{
				System.out.println("The String does not contains vowels");}
			}}
		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=s.toLowerCase();		
		int x=s.length();
		try {
		checkforvowels(str);}
		catch(NoVowelException e) {
		System.out.println(e.getMessage());}
			
		}
			
		
		

	}


