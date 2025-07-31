package first;

import java.util.*;

public class removeloop {
  Node head;

  class Node {
    int data;
    Node next;

    Node(int val) {
      data = val;
      next = null;
    }
  }

  removeloop() {
    head = null;
  }

  public void insertbegin(int val) {
    Node nn = new Node(val);
    if (head == null) {
      head = nn;
    } else {
      nn.next = head;
      head = nn;
    }
  }

  public void remove() {
    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        remove_loop(slow);
        break;
      }
    }
  }

  public void remove_loop(Node slow) {
    Node temp = head;
    while (temp.next != slow.next) {
      temp = temp.next;
      slow = slow.next;
    }
    slow.next = null;
  }

  public void createLoop(int node1, int node2) {
    Node temp = head;
    Node loopNode = null;
    int count = 1;
    while (temp.next != null) {
      if (count == node1) {
        loopNode = temp;
      }
      temp = temp.next;
      count++;
    }
    temp.next = loopNode;
  }
  public void printList() {
	    Node temp = head;
	    int count = 1;
	    Set<Node> set = new HashSet<>();
	    while (temp != null && count <= 20) {
	      if (set.contains(temp)) {
	        System.out.println("Loop detected");
	        break;
	      }
	      set.add(temp);
	      System.out.print(temp.data + " ");
	      temp = temp.next;
	      count++;
	    }
	    System.out.println();
	  }

	  public static void main(String[] args) {
	    removeloop list = new removeloop();
	    list.insertbegin(1);
	    list.insertbegin(2);
	    list.insertbegin(3);
	    list.insertbegin(4);
	    list.insertbegin(5);
	    list.createLoop(3, 5);
	    System.out.println("Linked List: ");
	    list.printList();
	    list.remove();
	    System.out.println("Linked List after removing loop: ");
	    list.printList();
	  }
	}
