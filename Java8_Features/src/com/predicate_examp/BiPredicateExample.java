package com.predicate_examp;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPredict = (i, j) -> i + j > 50;
		System.out.println(biPredict.test(5, 99));
	}
}
