// 1. Basic lambdas. Make an array containing a few Strings. Sort it by
//• length (i.e., shortest to longest)
//• reverse length (i.e., longest to shortest)
//• alphabetically by the first character only
//• Strings that contain “e” first, everything else second
//Note 1: the compare method of Comparator should return a negative number if the first entry is
//“less” than the second, a positive number if the first entry is “greater” than the second, and 0 if they
//are the same. See the JavaDoc API for details.
//Note 2: to print out an array after sorting, do System.out.println(Arrays.asList(yourArray))
//The point of this is that if you just print an array directly, you do not see anything useful (just the
//memory address), but if you print a List, it shows the individual elements separated by commas.
//So, the above trick is simpler than making a loop to traverse the array and print out the elements.

//3. Making your own interfaces for which lambdas can be used. Make a class with a static
//method called betterString. For arguments, this method should take two Strings and a lambda
//that says whether the first of the two is “better”. The method should return that better String;
//i.e., if the lambda returns true the method should return the first String, otherwise it should
//return the second String. For the lambda, define an interface called TwoStringPredicate with a
//method called isFirstBetterThanSecond that takes two Strings and returns true if the first is “better” than the second, false otherwise.
//Here are two examples (the first returns whichever of string1 and string2 is longer,
//and the second always returns string1).
//• StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length())
//• StringUtils.betterString(string1, string2, (s1, s2) -> true)

package com.rakuten.training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTask {

	public static String[] strings = { "this", "is", "a", "bunch", "of", "bizzare", "words", "like", "xylophone" };

	public static int checkForE(String c1, String c2) {
		if (c1.contains("e") && !c2.contains("e")) {
			return -1;
		} else if (!c1.contains("e") && c2.contains("e")) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<>(Arrays.asList(strings));
		Collections.sort(wordList, (c1, c2) -> c1.length() - c2.length());
		System.out.println(wordList);

		Collections.sort(wordList, (c1, c2) -> c2.length() - c1.length());
		System.out.println(wordList);

		Collections.sort(wordList, (c1, c2) -> {
			if (c1.charAt(0) > c2.charAt(0)) {
				return 1;
			} else if (c1.charAt(0) < c2.charAt(0)) {
				return -1;
			} else {
				return 0;
			}
		});
		System.out.println(wordList);
//		Collections.sort(wordList, (c1, c2) -> {
//			if (c1.contains("e") && !c2.contains("e")) {
//				return -1;
//			} else if (!c1.contains("e") && c2.contains("e")) {
//				return 1;
//			} else {
//				return 0;
//			}
//		});
//		System.out.println(wordList);
		Collections.sort(wordList, LambdaTask::checkForE);
		System.out.println(wordList);
		
		String lengthier1 = betterString("hi","Hello",(s1,s2) -> s1.length() > s2.length());
		System.out.println(lengthier1);
		
		String lengthier2 = betterElement("hi","Hello",(s1,s2) -> s1.length() > s2.length());
		System.out.println(lengthier2);

	}

	public static String betterString(String string1, String string2, TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(string1, string2)) {
			return string1;
		}else {
			return string2;
		}
	}
	
	private static <ET> ET betterElement(ET e1, ET e2, TwoElementpredicate<ET> decider) {
		if(decider.isFirstBetterThanSecond(e1, e2)) {
			return e1;
		}else {
			return e2;
		}
	}

}
