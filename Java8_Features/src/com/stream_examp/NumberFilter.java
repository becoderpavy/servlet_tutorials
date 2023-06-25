package com.stream_examp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumberFilter {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(1, 2, 3, 4, 5);

		// st.forEach(System.out::println);
		st.filter((e) -> e > 2).forEach(i -> System.out.println(i));

		List<String> asList = Arrays.asList("Jack", "Ram", "Shyam", "Pavy");
		asList.stream().filter(n -> n.startsWith("P")).forEach(System.out::println);

	}
}
