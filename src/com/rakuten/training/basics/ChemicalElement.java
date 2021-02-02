
/*Design and implement chemical elements

The periodic table of chemical elements classifies and displays all chemical elements. Each chemical element has a unique symbolic 
name and atomic number (number of protons).
Chemcial elements are grouped together by common characteristics (alkali metal, poor metal, ...) called the chemical series.

Examples of chemical elements:

H (hydrogenium): Hydrogen with atomic number 1.
O (oxygenium): Oxygen with atomic number 8.
K: Potassium with atomic number 19. It is an alkali metal.
Zn: Zinc (from german Zink) with atomic number 30. It is a transition metal.
Ga: Gallium with atomic number 31. It is a metal.
We consider the following chemical series:

Alkali metals are all chemical element with atomic number 3, 11, 19, 37, 55, or 87
Transition metals are all chemical elements with atomic number from 21 to 31, 39 to 48, 72 to 80, and 104 to 112.
Metalsare all chemical elements with atomic number 13, 49, 50, 81, 82, 83, 113, 114, 115, or 116.
Design and implement a class ChemicalElement. The class should contain methods to retrieve for a chemical element its name, 
symbolic name, atomic number, 
and which type of metal it is (three different methods for each metal property). Implement these three methods without if or else, but

one method with a switch
one method with a single boolean expression
one method with a static boolean-array where the index is the atomic number. You can initialize the array in the static 
initializer of the class ( static { ... } ).
Make sure that you choose for each of these three methods the best of the above implementations. 
How do these variants differ with respect to the maintainability and performance of the program?

Add constants for the above five examples of chemical elements to the class.

The values of a chemical element must be unmutable: once a chemical element is constructed, 
its must not be possible to change its internal state (like String objects).

Let the class have fields for name,symbolicNAme and atomicNumber
Methods : isAlkaliMetal,isTransitionMetal and isMetal*/

/*public class ChemicalElement {
	private String name, symbolicName;
	private int atomicNumber;

	private static boolean[] alkaliMetals = new boolean[120];

	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}

	public ChemicalElement(String name, String symbolicName, int atomicNumber) {
		this.name = name;
		this.symbolicName = symbolicName;
		this.atomicNumber = atomicNumber;

	}

	public boolean isAlkaliMetal() {

		return alkaliMetals[atomicNumber];
	}

}*/
package com.rakuten.training.basics;

public class ChemicalElement implements Comparable<ChemicalElement> {

	private int atomicNumber;
	private String name;
	private String symbol;

	private static boolean[] alkaliMetals = new boolean[120];

	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}

	public ChemicalElement(int atomicNumber, String name, String symbol) {
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;

	}

	public boolean isTransitionMetal() {
		return (atomicNumber >= 21 && atomicNumber <= 31) || (atomicNumber >= 39 && atomicNumber <= 48)
				|| (atomicNumber >= 72 && atomicNumber <= 80) || (atomicNumber >= 104 && atomicNumber <= 112);
	}

	public boolean isAlkaliMetal() {
		return alkaliMetals[atomicNumber];
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", name=" + name + ", symbol=" + symbol + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atomicNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElement other = (ChemicalElement) obj;
		if (atomicNumber != other.atomicNumber)
			return false;
		return true;
	}

	@Override
	public int compareTo(ChemicalElement other) {
		if (this.atomicNumber > other.atomicNumber) {
			return 1;
		} else if (other.atomicNumber > this.atomicNumber) {
			return -1;
		} else {
			return 0;
		}
	}

}
