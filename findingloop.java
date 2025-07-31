package first;
import java.util.*;
public class findingloop {
	 Node head;
	    class Node{
	        int data;
	        Node next;
	        Node(int val){
	            data = val;
	            next = null;    
	        }
	    }
	    findingloop(){
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
	    public boolean detectLoop() {
	        if (head == null || head.next == null) {
	          return false;
	        }
	        Node slow = head;
	        Node fast = head;
	        while (fast.next != null && fast.next.next != null) {
	          slow = slow.next;
	          fast = fast.next.next;
	          if (slow == fast) {
	            return true;
	          }
	        }
	        return false;
	      }

	      public void createLoop(int node1, int node2) {
	        Node temp = head;
	        Node loopNode = null;
	        Node connectNode = null;
	        int count = 1;
	        while (temp.next != null) {
	          if (count == node1) {
	            loopNode = temp;
	          }
	          if (count == node2) {
	            connectNode = temp;
	          }
	          temp = temp.next;
	          count++;
	        }
	        if (loopNode != null && connectNode != null) {
	          temp.next = loopNode;
	        }
	      }
	      public void printList() {
	    	    Node temp = head;
	    	    int count = 1;
	    	    while (temp != null && count <= 10) {
	    	      System.out.print(temp.data + " ");
	    	      temp = temp.next;
	    	      count++;
	    	    }
	    	    System.out.println();
	    	  }
	    	

	    
	    	  public static void main(String[] args) {
	    		findingloop list = new findingloop();
	    	    list.insertbegin(1);
	    	    list.insertbegin(2);
	    	    list.insertbegin(3);
	    	    list.insertbegin(4);
	    	    list.insertbegin(5);
	    	    System.out.println("Linked List: ");
	    	    list.printList();
	    	    System.out.println("Loop detected: " + list.detectLoop());
	    	    list.createLoop(5,3);
	    	    System.out.println("Loop detected: " + list.detectLoop());
	    	  }
			 
			  
	    	}

