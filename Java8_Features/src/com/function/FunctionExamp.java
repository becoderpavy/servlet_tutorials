package com.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExamp {

	// lamda taking argument and return value
	public static void main(String[] args) {
		// User us=new User("Becode", 12);

		Function<Integer, Integer> fn = (i) -> i * i;
		System.out.println(fn.apply(4));

		BiFunction<Integer, Integer, Integer> fn2 = (i, j) -> i * j;
		System.out.println(fn2.apply(4, 2));

	}
}
