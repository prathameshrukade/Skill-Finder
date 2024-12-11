package day2.acts.stack.stacktest;

import day2.acts.stack.Stack;
import day2.acts.stack.excep.StackEmptyException;

public class FixedSizeStack implements Stack{
	
	private int []stackData;
	private int top;
	
	
	public FixedSizeStack() {
		stackData=new int[2];
		top=-1;
	}
	public FixedSizeStack(int n) {
		stackData=new int[n];
		top=-1;
	}
	@Override
	public void push(int ele) {
		if(isFull()) {
			
			int tempArr[]=new int[stackData.length*2];
			
			for(int i=0;i<stackData.length;i++) {
				tempArr[i]=stackData[i];
			}
			stackData=tempArr;
		}
		++top;
		stackData[top]=ele;
	
	}
	
	@Override
	public int pop() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty");
		}
		int ele=stackData[top];
		top--;
		return ele;
	}
	@Override
	public int peak() {
		
		return stackData[top];
	}
	@Override
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	@Override
	public boolean isFull() {
		if(top==stackData.length-1) {
			return true;
		}
		return false;
	}
	
	
}
