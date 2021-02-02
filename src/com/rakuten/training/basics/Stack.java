package com.rakuten.training.basics;
/*

Create an interface called Stack to represent a LIFO stack. It should have the following methods :
public void push(Object element)
and public Object pop()
Create an implementation class of Stack called FixedArrayStack which uses an Object array to store
all the elements
Create a class called StackUser which has the following 2 methods
public void fill(Stack s) - in a loop push some 10 random numbers into the supplied stack and print
each value pushed
public void empty(Stack s) - in a loop pop out 10 objects from the supplied stack and display each
element you popped out
Create a class StackApp with a main to connect the above three classes together.
Notice how StackUser is in no way coupled to FixedArrayStack and can work with similar such*/
public interface Stack {
	public void push(Object element);
	public Object pop();
}
