package com.rakuten.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "h");
		System.out.println("Hyodregen is a alkali metal " + h.isAlkaliMetal());

	}

}
