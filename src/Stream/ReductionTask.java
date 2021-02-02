//Part 2
//For these exercises, start with a List of Strings similar to this:
//• List<String> words = Arrays.asList("hi", "hello", ...);
//1. Produce a single String that is the result of concatenating the uppercase versions of all of the
//Strings. E.g., the result should be "HIHELLO...". Use a single reduce operation, without using map.
//2. Produce the same String as above, but this time via a map operation that turns the words into upper
//case, followed by a reduce operation that concatenates them.
//3. Produce a String that is all the words concatenated together, but with commas in between. E.g., the
//result should be "hi,hello,...". Note that there is no comma at the beginning, before “hi”, and also no
//comma at the end, after the last word. Major hint: there are two versions of reduce we discussed
//Part 3
//1. Make a very large array of random doubles, each of which ranges from 0 to 1. A quick and easy
//way to do this is with “new Random().doubles(size).toArray()”.
//2. Compute the sum of the square roots of the numbers in the array. Find a shorter and simpler way
//than making a loop to tally the sum. Hint: review the notes on number-specialized streams, especially
//the fact that you make a DoubleStream from a double[] with DoubleStream.of, not Stream.of.
//3. Repeat the process in parallel. Once you have #2 working, this should be very simple.
//4. Verify that you get the “same” answer with the parallel approach as with the sequential approach.
//Why do I have “same” in quotes in the previous sentence?

package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionTask {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = Arrays.asList("this", "is", "a", "bunch", "of", "bizzare", "words", "like", "xylophone");
		
		String upperCaseByReduce = wordList.stream().reduce("",(s1,s2)-> s1.toUpperCase() + s2.toUpperCase());
		System.out.println(upperCaseByReduce);
		
		String upperCaseByMapAndReduce = wordList.stream().map(e->e.toUpperCase()).reduce("",String::concat);
		System.out.println(upperCaseByMapAndReduce);
		
		String comma = wordList.stream().reduce((s1,s2) -> s1 + "," + s2).orElse("need at least two strings");
		System.out.println(comma);
		
		String wordsWithCommas = 
		        wordList.stream().reduce((s1, s2) -> s1 + "," + s2)
		                      .orElse("need at least two strings");
		    System.out.printf(wordsWithCommas);
		
 	}

}

//package solutions.streams.part2;
//
//import java.util.*;
//
//
//
//public class StreamExamples {
//  public static void main(String[] args) {
//    List<String> words = 
//        Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
//    System.out.printf("Original words: %s.%n", words);
//    //  Stream<String> wordStream = words.stream();  NO!! Why not?
//    
//    String upperCaseWords = 
//        words.stream().reduce("", (s1, s2) -> s1.toUpperCase() 
//                                              + s2.toUpperCase());
//    System.out.printf("Single uppercase String: %s.%n", 
//                      upperCaseWords);
//    
//    String upperCaseWords2 = 
//        words.stream().map(String::toUpperCase)     // Or .map (s -> s.toUpperCase())
//                      .reduce("", String::concat);  // Or .reduce("", (s1,s2) -> s1+s2)
//    System.out.printf("Single uppercase String: %s.%n", 
//                      upperCaseWords2);
//    
//    String wordsWithCommas = 
//        words.stream().reduce((s1, s2) -> s1 + "," + s2)
//                      .orElse("need at least two strings");
//    System.out.printf("Comma-separated String: %s.%n", 
//                      wordsWithCommas);
//    
//    int numberOfChars =
//        words.stream().mapToInt(String::length)
//                      .sum();
//    System.out.printf("Total number of characters: %s.%n", 
//                      numberOfChars);
//    
//    long numberOfWordsWithH =
//        words.stream().filter(s -> s.contains("h"))
//                      .count();
//    System.out.printf("Number of words containing 'h': %s.%n", 
//                      numberOfWordsWithH);
//  }
//}
//
//
//package solutions.streams.part3;
//
//import java.util.*;
//import java.util.stream.*;
//
//public class MathUtils {
//  public static double[] randomArray(int size) {
//    return(new Random().doubles(size).toArray());
//  }
//  
//  /** Return the sum of the square roots of entries in the array. 
//   */
//  public static double sqrtSum(double[] nums) {
//    return(DoubleStream.of(nums).map(Math::sqrt).sum());
//  }
//  
//  public static double sqrtSumParallel(double[] nums) {
//    return(DoubleStream.of(nums).parallel().map(Math::sqrt).sum());
//  }
//
//  // Or, use DoubleStream.generate, which produces DoubleStream
//  // instead of Stream<Double>
//  public static Stream<Double> randomNums(double maxValue) {
//    return(Stream.generate(() -> Math.random() * maxValue));
//  }
//}
//
//
//package solutions.streams.part3;
//
//import java.util.*;
//import java.util.stream.*;
//
//
//
//public class StreamExamples {
//  public static void main(String[] args) {
//    //double[] nums = { 1, 4, 9 };
//    double[] nums = MathUtils.randomArray(100_000_000);
//    System.out.println("Summing sequentially:");
//   
//      double sum = MathUtils.sqrtSum(nums);
//      System.out.printf("  Sum is %,.8f.%n", sum);
//  
//    System.out.println("Summing in parallel:");
//   
//      sum = MathUtils.sqrtSumParallel(nums);
//      System.out.printf("  Sum is %,.8f.%n", sum);
//   
//    
//    System.out.println("Random nums:");
//    MathUtils.randomNums(10).limit(5).forEach(System.out::println);
//    List<Double> randomNums1 = 
//      MathUtils.randomNums(10).limit(10).collect(Collectors.toList());
//    System.out.println("List of random nums: " + randomNums1);
//    Double[] randomNums2 =
//      MathUtils.randomNums(10).limit(20).toArray(Double[]::new);
//    System.out.println("Array of random nums: " + Arrays.asList(randomNums2));
//  }
//}

