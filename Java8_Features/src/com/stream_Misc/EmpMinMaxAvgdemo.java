package com.stream_Misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpMinMaxAvgdemo {
	public static void main(String[] args) {

		List<Emp> asList = Arrays.asList(new Emp("Becoder", 43, 2312), new Emp("Jaggy", 43, 234),
				new Emp("Shyam", 26, 2000));

		Double collect = asList.stream().collect(Collectors.averagingInt(e -> e.getSalary()));
		System.out.println(collect);

		Optional<Emp> collect2 = asList.stream().collect(Collectors.minBy(Comparator.comparing(Emp::getSalary)));
		System.out.println(collect2.get().getName());

		Optional<Emp> collect3 = asList.stream().collect(Collectors.maxBy(Comparator.comparing(Emp::getSalary)));
		System.out.println(collect3.get().getName());

		// Integer min = Stream.of(1, 2, 3, 4, 5, 6).min(Comparator.comparing(Integer::valueOf)).get();
	}
}
