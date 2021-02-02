package com.rakuten.training.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		demoSimpleMapOps();

	}

	private static void demoSimpleMapOps() {
		Map<String,Integer> runs = new HashMap<>();
		runs.put("Virat", 100);
		runs.put("Bhuvi", 45);
		runs.put("Rohit", 32);
		runs.put("Virat", 103);
		System.out.println("Is there a batsman called Rohit? "+runs.containsKey("Rohit"));
		System.out.println("Anyone scored exact 100? "+runs.containsValue(100));
		System.out.println("How many runs for Bhuvi? "+runs.get("Bhuvi"));
		System.out.println("How many runs for Jinx? "+runs.get("Jinx"));
		
	}

}

/* 
 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.rakuten.training.basics.ChemicalElement;

public class MapDemo {

	public static void main(String[] args) {
//		demoSimpleMapOps();

		demoMapOfUserDefinedKeyType();
	}

	private static void demoMapOfUserDefinedKeyType() {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement k = new ChemicalElement(19	, "Potassium", "K");
		ChemicalElement zn = new ChemicalElement( 30, "Zinc", "Zn");
		
		Map<ChemicalElement,Double> earthComposition = new HashMap<>();
		earthComposition.put(o, 41.0);
		earthComposition.put(k, 0.5);
		earthComposition.put(zn, 1.1);
		
//		System.out.println("How much of earth is Oxygen? "+earthComposition.get(o));
		Scanner kb = new Scanner(System.in);
//		while(true) {
			System.out.println("Enter an atomic number to test: ");
			int num = Integer.parseInt(kb.nextLine());
			
			ChemicalElement anUnknownElement = new ChemicalElement(num, null, null);
			
			System.out.println("Do I know how much of earth element with atmic number "+num+" is? " );
			System.out.println(earthComposition.containsKey(anUnknownElement));
			if(earthComposition.containsKey(anUnknownElement)) {
				double percentage = earthComposition.get(anUnknownElement);
				System.out.println(percentage+" % of earth is element with atomic number "+num);
			}
			
//		}
	}

	private static void demoSimpleMapOps() {
		Map<String,Integer> runs = new HashMap<>();
		runs.put("Virat", 100);
		runs.put("Bhuvi", 45);
		runs.put("Rohit", 32);
		
		System.out.println("Is there a batsman called Rohit? "+runs.containsKey("Rohit"));
		System.out.println("Anyone scored exact 100? "+runs.containsValue(100));
		String bhuvi = new String("Bhuvi");
		System.out.println("How many runs for Bhuvi? "+runs.get(bhuvi));
		System.out.println("How many runs for Jinx? "+runs.get("Jinx"));
		
	}

}
*/
