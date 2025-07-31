package first;
import java.util.LinkedList;
public class linkedlist_collection {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(89);
		list.add(40);
		list.sort(null);
		list.removeLast();
		System.out.println(list);}

}
