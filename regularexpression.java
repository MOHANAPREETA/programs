package first;

import java.util.regex.Pattern;

public class regularexpression {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[xyz]*","xxyyzz"));
		System.out.println(Pattern.matches("[xyz]+","xy"));
		System.out.println(Pattern.matches("[xyz]?","m"));

	}

}
