package com.rakuten.training.lambda;

@FunctionalInterface
public interface TwoElementpredicate<T> {
	public boolean isFirstBetterThanSecond(T first,T  second);
}
