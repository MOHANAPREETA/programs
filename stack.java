package first;
import java.util.Stack;
public class stack {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.add(45);
		st.add(46);
		st.add(43);
		st.add(42);
		st.push(52);
	    System.out.println(st.peek());
	    System.out.println(st);
	    st.pop();
	    System.out.println(st);
		

	}

}
