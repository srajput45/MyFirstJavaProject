//Part 1
//For all the exercises, start with a List of Strings similar to this:
//• List<String> words = Arrays.asList("hi", "hello", ...);
//1. Loop down the words and print each on a separate line, with two spaces in front of each word.
//Don’t use map.
//2. Repeat the previous problem, but without the two spaces in front. This is trivial if you use the same
//approach as in #1, so the point is to use a method reference here, as opposed to an explicit lambda
//in problem 1.
//3. In the previous exercise, we produced transformed lists like this:
//• List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
//• List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
//• List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
//Produce the same lists as above, but this time use streams and the builtin “map” method.
//4. In the previous exercise, we produced filtered lists like this:
//• List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
//• List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
//• List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
//Produce the same lists as above, but this time use “filter”.


package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = Arrays.asList("this", "is", "a", "bunch", "of", "bizzare", "words", "like", "xylophone");
		
		wordList.stream().forEach(e ->{
			System.out.println("  "+e);
		});
		
		wordList.stream().forEach(System.out::println);
		
		
//		List mapList = wordList.stream().map(e -> e+"!"). collect(Collectors.toList());
//		System.out.println(mapList);
		
		wordList.stream().map(e -> e+"!"). forEach(System.out::println);
		
	
 	}

}
