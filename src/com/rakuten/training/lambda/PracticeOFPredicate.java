//1. Make a static method called allMatches. It should take a List of Strings and a
//Predicate<String>, and return a new List of all the values that passed the test. Test it with several
//examples. E.g.:
//• List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
//• List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
//• List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
// List<String> words = Arrays.asList("hi", "hello", ...);

//2. Redo allMatches so it works on any List and associated Predicate, not just on Strings. Verify that
//your examples from #1 still work. But now, you should be able to also do things like this:
//• List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
//• List<Integer> bigNums = ElementUtils.allMatches(nums, n -> n>500);

//3. Make a static method called transformedList. It should take a List of Strings and a
//Function<String,String> and return a new List that contains the results of applying the Function to
//each element of the original List. E.g.:
//• List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
//• List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
//• List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);

//4. Redo transformedList so it works with generic types. Verify that your examples from #3 still work.
//But now, you should also be able to also do things like this:
//• List<Integer> wordLengths = ElementUtils.transformedList(words, String::length);
//Notice above that I am passing in a List of Strings, but getting out a List of Integer. Make sure your generic types support this idea.

package com.rakuten.training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface elementPredicate<T> {
	public boolean isFirstBetterThanSecond(T first);
}

public class PracticeOFPredicate {
	
	public static void main(String[] args) {
		List<String> wordList = Arrays.asList("this", "is", "a", "bunch", "of", "bizzare", "words", "like", "xylophone");

		List<String> shortWords = allMacthes(wordList, s -> s.length() < 4);
		System.out.println(shortWords);
		List<String> wordsWithB = allMacthes(wordList, s -> s.contains("b"));
		System.out.println(wordsWithB);
		List<String> evenLengthWords = allMacthes(wordList, s -> (s.length() % 2) == 0);
		System.out.println(evenLengthWords);
		
//		--------------------------------------------PART 2----------------------------------
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		
		List<Integer> bigNums = allMacthes(nums, n -> n>500);
		System.out.println(bigNums);

	}

	public static <T> List<T> allMacthes(List<T> t, elementPredicate<T> result) {
		List<T> finalList = new ArrayList<>();
		for (T t1 : t) {
			if (result.isFirstBetterThanSecond(t1)) {
				finalList.add(t1);
			}
		}
		return finalList;
	}

}

//
//package solutions.lambda.part2;
//
//import java.util.*;
//import java.util.function.*;
//
//
//
//public class StringUtils {
// public static List<String> allMatches(List<String> candidates, 
//                                       Predicate<String> matchFunction) {
//   List<String> results = new ArrayList<>();
//   for(String possibleMatch: candidates) {
//     if(matchFunction.test(possibleMatch)) {
//       results.add(possibleMatch);
//     }
//   }
//   return(results); 
// }
// 
// 
// public static List<String> transformedList(List<String> originals, 
//                                            Function<String, String> transformer) {
//   List<String> results = new ArrayList<>();
//   for(String original: originals) {
//     results.add(transformer.apply(original));
//   }
//   return(results); 
// }
// 
// private StringUtils() {} // Uninstantiatable class
//}
//

//package solutions.lambda.part2;
//
//import java.util.*;
//import java.util.function.*;
//
//
//
//public class ElementUtils {
//  public static <T> List<T> allMatches(List<T> candidates, 
//                                       Predicate<T> matchFunction) {
//    List<T> results = new ArrayList<>();
//    for(T possibleMatch: candidates) {
//      if(matchFunction.test(possibleMatch)) {
//        results.add(possibleMatch);
//      }
//    }
//    return(results); 
//  }
//
//  public static <T, R> List<R> transformedList(List<T> originals, 
//                                               Function<T, R> transformer) {
//    List<R> results = new ArrayList<>();
//    for(T original: originals) {
//      results.add(transformer.apply(original));
//    }
//    return(results); 
//  }
//  
//  private ElementUtils() {} // Uninstantiatable class
//}
