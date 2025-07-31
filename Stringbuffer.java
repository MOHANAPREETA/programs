package first;

public class Stringbuffer {

	public static void main(String[] args) {
	StringBuffer b=new StringBuffer();
	b.append("Joseph's");
	b.insert(7,"of Engineering");
	b.replace(0, 7,"st Joseph's");
	b.delete(8, 12);
	b.reverse();
	System.out.println(b);

	}

}
