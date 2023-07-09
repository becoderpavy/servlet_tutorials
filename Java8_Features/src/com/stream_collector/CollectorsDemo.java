package com.stream_collector;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {
	public static void main(String[] args) {
		Map<String, Integer> collect = Arrays.asList("Hari", "Shyam", "krish").stream()
				.collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(collect);
	}
}
