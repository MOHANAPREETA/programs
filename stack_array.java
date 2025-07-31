
package first;

import java.util.Stack; // This import is not needed, you can remove it

public class stack_array {
  private int maxSize;
  private int top;
  private int[] stackArray;

  public stack_array(int size) { // Changed constructor name to match class name
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int value) {
    if (top >= maxSize - 1) {
      System.out.println("Stack is full");
      return;
    }
    stackArray[++top] = value;
  }
  public int pop() {
	    if (top < 0) {
	      System.out.println("Stack is empty");
	      return -1; // or throw an exception
	    }
	    return stackArray[top--];
	  }

	  public int peek() {
	    if (top < 0) {
	      System.out.println("Stack is empty");
	      return -1; // or throw an exception
	    }
	    return stackArray[top];
	  }

	  public boolean isEmpty() {
	    return (top == -1);
	  }

	  public boolean isFull() {
	    return (top == maxSize - 1);
	  }

	  public int size() {
	    return top + 1;
	  }

	  public void printStack() {
	    if (top < 0) {
	      System.out.println("Stack is empty.");
	      return;
	    }
	    System.out.print("Stack elements: ");
	    for (int i = 0; i <= top; i++) {
	      System.out.print(stackArray[i] + " ");
	    }
	    System.out.println();
	  }
	  public static void main(String[] args) {
		    stack_array stack = new stack_array(5); // Changed type to match class name
		    stack.push(10);
		    stack.push(20);
		    stack.push(30);
		    stack.printStack(); // Stack elements: 10 20 30
		    System.out.println("Top element: " + stack.peek()); // Top element: 30
		    System.out.println("Popped element: " + stack.pop()); // Popped element: 30
		    stack.printStack(); // Stack elements: 10 20
		    System.out.println("Is stack empty? " + stack.isEmpty()); // Is stack empty? false
		    System.out.println("Stack size: " + stack.size()); // Stack size: 2
		  }
		}



