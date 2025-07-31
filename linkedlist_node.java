package first;
import java.util.*;

import first.Linkedlist.Node;
public class linkedlist_node {
	 Node head;

	    class Node{
	        int data;
	        Node next;
	        //Node head;

	        Node(int val){
	            data = val;
	            next = null;
	            //head = null;
	        }
	    }
	    linkedlist_node(){
	        head = null;
	    }
	    public void insertbegin(int val){
	        Node newnode = new Node(val);
	        if (head == null){
	            head = newnode;
	        }
	        else{
	            newnode.next = head;
	            head = newnode;
	        }
	    }
	    public void deleteend(){
	        Node temp = head;
	        while (temp.next.next != null) {
	                temp = temp.next;
	            }
	            temp.next = null;
	           }
	    public void display(){
	        Node temp = head;

	        while(temp != null){
	            System.out.print(temp.data+"-->");
	            temp = temp.next;
	        }
	        System.out.println("Null");
	    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	        Linkedlist list = new Linkedlist();

	        int m = sc.nextInt();
	        for (int i =0 ;i<m;i++){
	            int val = sc.nextInt();
	            list.insertbegin(val);
	            list.deleteend();
	            list.display();
	        }
	}

}
