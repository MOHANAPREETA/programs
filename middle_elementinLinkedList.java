package first;

import java.util.*;
public class middle_elementinLinkedList {
	static Node head;

class Node {
  int data;
  Node next;

 Node(int val) {
    data = val;
   next = null;
  }
}

middle_elementinLinkedList() {
  head=null;}

  public void insert(int val) {
		Node newnode=new Node(val);
	
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}


  public static int length(Node head)
	{
	
		int length=0;
		while(head!=null)
		{
			length++;
			head=head.next;
		}
		return length;
	}
	
	public int mid(Node head)
	{
		int len=length(head);
		int mid=len/2;
		while(mid>0)
		{
			head=head.next;
			mid--;
		}
		return head.data;
	}


 


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		middle_elementinLinkedList m=new middle_elementinLinkedList();
		
		while(true)		
		{
			int val=sc.nextInt();
			if(val==-1)
				break;
			m.insert(val);
			
		}
		System.out.println("Mid Element is: "+m.mid(head));
	
		
	}

}
