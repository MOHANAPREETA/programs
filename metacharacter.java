package first;
import java.util.regex.Pattern;
public class metacharacter {

	public static void main(String[] args) {
		System.out.println("Meta characters d...");
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4445"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		System.out.println("Meta characters D...");
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "4445"));
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println("Meta characters D with quantifiers...");
		System.out.println(Pattern.matches("\\D", "abc"));

	}

}
