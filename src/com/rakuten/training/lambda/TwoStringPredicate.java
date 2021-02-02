package com.rakuten.training.lambda;

@FunctionalInterface
public interface TwoStringPredicate {
	public boolean isFirstBetterThanSecond(String string1,String  string2);
}