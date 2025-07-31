package first;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_Example {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(50);
		q.add(40);
		q.add(30);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		q.clear();
		System.out.println(q);

	}

}
