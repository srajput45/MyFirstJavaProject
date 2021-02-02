package com.rakuten.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.rakuten.training.basics.ChemicalElement;

public class SortDemo {
	public static String[] strings = { "this", "is", "a", "bunch", "of", "bizzare", "words", "like", "xylophone" };

	public static void main(String[] args) {
		// demoSimpleSortOfStrings();
		demoSortOfUserDefinedClass();
	}

	private static void demoSortOfUserDefinedClass() {
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement zn = new ChemicalElement(30, "Zinc", "Zn");

		List<ChemicalElement> cList = new ArrayList<>();
		cList.add(k);
		cList.add(zn);
		cList.add(h);
		cList.add(o);
		System.out.println(cList);
		// Collections.sort(cList);
		// Collections.sort(cList,(c1, c2)-> c1.getAtomicNumber() -
		// c2.getAtomicNumber());
		Collections.sort(cList, (c1, c2) -> c1.getName().length() - c2.getName().length());
		System.out.println(cList);

	}

	private static void demoSimpleSortOfStrings() {
		//List<String> wordList = Arrays.asList(strings); // this will sort the orignal array anyway.
		List<String> wordList = new ArrayList<>(Arrays.asList(strings));
		// this will create a new array which will be the copy of the origanl array and
		// then sort that array. The orignal array will remain the same. //
		System.out.println(strings);
		// System.out.println(wordList);

		// Arrays.sort(strings);
		// System.out.println(Arrays.asList(strings));

		Collections.sort(wordList);
		System.out.println(wordList);
		for (String aWord : strings) {
			System.out.println(aWord);
		}
	}

}
