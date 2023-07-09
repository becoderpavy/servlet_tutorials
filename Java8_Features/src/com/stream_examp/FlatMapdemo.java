package com.stream_examp;

import java.util.Arrays;
import java.util.List;

public class FlatMapdemo {

	public static void main(String[] args) {
		// if we have collection inside collectio we can go flatmap

		List<String> backend = Arrays.asList("Java", "J2EE", ".NET");
		List<String> frontend = Arrays.asList("Html", "Css", "React");

		List<List<String>> listCourse = Arrays.asList(backend, frontend);

		listCourse.stream().flatMap(e -> e.stream()).forEach(System.out::println);

	}

}
