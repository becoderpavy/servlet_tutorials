package com.stream_slicing;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo {
	public static void main(String[] args) {

		// distinct
		// limit
		// skip
		List<String> country = Arrays.asList("UK", "IND", "USA", "NA", "GE", "USA");
		// country.stream().distinct().forEach(System.out::println);
		 country.stream().limit(3).forEach(System.out::println);
		//country.stream().skip(3).forEach(System.out::println);
	}
}
