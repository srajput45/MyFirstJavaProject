package com.rakuten.training.collections;

import java.util.Comparator;

import com.rakuten.training.basics.ChemicalElement;

public class ChemicalElementAtomicNumberComparator implements Comparator<ChemicalElement> {
	
	@Override
	public int compare(ChemicalElement c1, ChemicalElement c2) {
		if(c1.getAtomicNumber() > c2.getAtomicNumber()) {
			return 1;
		}else if(c2.getAtomicNumber() > c1.getAtomicNumber()) {
			return -1;
		}else {
			return 0;
		}
		
		//return c1.getAtomicNumber() - c2.getAtomicNumber()
	}

}

