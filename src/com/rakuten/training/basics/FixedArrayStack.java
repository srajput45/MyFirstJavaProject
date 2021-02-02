package com.rakuten.training.basics;

public class FixedArrayStack implements Stack{
	
	private Object[] content;
	private int top = -1;
	
	public FixedArrayStack(int arraySize) {
		// TODO Auto-generated constructor stub
		content = new Object[arraySize];
	}
	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		if(top<content.length) {
			content[++top] = element;
		}else {
			System.out.println("Stack is full!!!!!1");
		}
		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		
		return content[top--];
	}
	
}
