package com.rakuten.training.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		demoHashSet();

	}

	private static void demoHashSet() {
		Set<String> uniqueWords = new HashSet<>(); // Use LinkedHashSet for getting the words in the same order.

		try (Scanner kb = new Scanner(System.in)) { // There is no need of finally when you use resources inside the ()
													// of try. You can add more resource after using ";".
			while (true) {
				System.out.println("Enter a word:");
				String aWord = kb.nextLine();
				if (aWord.equalsIgnoreCase("quit")) {
					break;
				}
				if (!uniqueWords.add(aWord)) {
					System.out.println("That's a duplicate!!");
				}
			}
			System.out.println("_____________________");
			for (String s : uniqueWords) {
				System.out.println(s);
			}
		}
	}

}
