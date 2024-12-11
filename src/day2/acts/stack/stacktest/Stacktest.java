package day2.acts.stack.stacktest;

import day2.acts.stack.Stack;
import day2.acts.stack.excep.StackEmptyException;

public class Stacktest {
	
	public static int[] reverseStack(int [] arr,Stack f1) {
		for(int i=0;i<arr.length;i++) {
			f1.push(arr[i]);
		}
		try {
		for(int i=0;i<arr.length;i++) {
			arr[i]=f1.pop();
		}
		}catch(StackEmptyException e) {
			System.out.println(e);
		}
		
		return arr;
		
	}

	public static void main(String[] args) {

		System.out.println("Enter element to add to the stack");
		Stack f1=new FixedSizeStack(2);
		f1.push(10);
		f1.push(20);
		f1.push(30);
		try {
		int ele=f1.pop();
		System.out.println(ele);
		ele=f1.pop();
		System.out.println(ele);
		ele=f1.pop();
		System.out.println(ele);
		ele=f1.pop();
		System.out.println(ele);
		}catch(StackEmptyException e) {
			System.out.println(e);
		}
		
//		int []arr=new int[] {10,20,30,40};
//		
//		System.out.println("Array before reverse "+Arrays.toString(arr));
//		arr=reverseStack(arr,f1);
//		System.out.println("Array after reverse "+Arrays.toString(arr));
	}

}
