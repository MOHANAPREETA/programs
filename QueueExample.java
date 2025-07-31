package first;
import java.util.LinkedList;
class Queue{
	Node front=null,rear=null;
	void enqueue(int x) {
		Node temp=new Node();
		temp.data=x;
		if(rear==null) {
			front=rear=temp;}
		else {
			rear.next=temp;
			rear=temp;
		}
	}
	void dequeue() {
		if(front==null) 
		    return;
		    front=front.next;
		    if(front==null)
		    	rear=null;			    
	}
	int peek()
	{
		if(front==null) {
			System.out.println("Queue is empty");
		return -1;}
		else
			return front.data;
			
	}
	void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
public class QueueExample {

	public static void main(String[] args) {
		
			Queue q=new Queue();
			q.enqueue(12);
			q.enqueue(13);
			q.enqueue(14);
			q.peek();
			System.out.println(q.peek());
		    q.dequeue();
		    q.printQueue();
		    

			

	}

}
