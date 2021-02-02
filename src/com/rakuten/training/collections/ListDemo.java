package com.rakuten.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
//		demoRawList();
//		demoSpecificList();
		List<String> l = new ArrayList<>();
		myAlgo(l);

	}
	public static void myAlgo(List<String> l) {
		//some complex algo
		l.add("abc");
		l.add("first");
		l.get(1);
		
//		int size = l.size();
//		for(int i=0;i<size;i++) {
//			String s = l.get(i);
//			System.out.println(s);
//			if(s.length() == 3) {
//				l.remove(s);
//			}
//		}
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			if(s.length() == 3) {
				it.remove();
			}
		}
//		System.out.println(l);
		
		for(String s:l) {
			System.out.println(s);
		}
	}

	private static void demoSpecificList() {
		List<String> myList = new ArrayList<String>();
		myList.add("Rajput");
		myList.add("Shubham");
		System.out.println(myList.get(0));
		System.out.println(myList.size());
		
	}

	private static void demoRawList() {
		List l = new ArrayList();
		l.add("HEllo");
		l.add(1);
		l.add(4.20);
		
		System.out.println(l.get(2));
		System.out.println(l.size());		
	}

}
