package com.stream_Misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {
	public static void main(String[] args) {
		List<User> asList = Arrays.asList(new User("Becoder", 20000, "UK"), new User("Jaggy", 30000, "IND"),
				new User("Rakesh", 50000, "IND"), new User("Suresh", 10000, "USA"), new User("Sanjit", 70000, "UK")

		);

		Map<String, List<User>> collect = asList.stream().collect(Collectors.groupingBy(User::getCountry));
		System.out.println(collect);

	}
}
