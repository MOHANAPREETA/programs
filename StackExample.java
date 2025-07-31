package first;
import java.util.Stack;
class Node{
	int data;
	Node next;
}
class stackList{
	Node top=null;
	void push(int x) {
		Node temp=new Node();
		top.data=x;
		top.next=top;
		top=temp;
	}
	int pop() {
		if(top==null) {
			System.out.println("stack underflow");
		    return -1;}
		else {
			int val=top.data;
			top=top.next;
			return val;
		}
		    
	}
	int peek()
	{
		return(top!=null?top.data:-1);
	}
}

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(12);
		st.push(13);
		st.push(14);
	    System.out.println(st.peek());
	    st.pop();
	    System.out.println(st);
		
		

	}

}
