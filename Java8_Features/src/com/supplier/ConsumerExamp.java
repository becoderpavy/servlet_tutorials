package com.supplier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExamp {
	// lamda taking input but not return result
	public static void main(String[] args) {
		Consumer<String> cu = (name) -> System.out.println(name);
		cu.accept("Becoder");

		Consumer<Integer> cu2 = (i) -> System.out.println(i * i);
		cu2.accept(4);

		BiConsumer<String, Integer> bic = (name, age) -> System.out.println(name + "=" + age);
		bic.accept("Becoder", 25);

	}
}
