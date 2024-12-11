package day2.acts.stack;

import day2.acts.stack.excep.StackEmptyException;

public interface Stack {
	void push(int ele);
	int pop() throws StackEmptyException;
	int peak();
	boolean isEmpty();
	boolean isFull();
	
}
