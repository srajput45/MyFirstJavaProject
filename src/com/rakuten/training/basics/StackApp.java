package com.rakuten.training.basics;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUser user = new StackUser();
		
		FixedArrayStack s = new FixedArrayStack(10);
		
		user.fill10(s);

	}

}
