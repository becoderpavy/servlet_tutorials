package com.stream_matching;

import java.util.Arrays;
import java.util.List;

import com.predicate_examp.User;

public class MatchingDemo {
	public static void main(String[] args) {

		// anymatch
		// allmatch
		// nonematch

		List<User> asList = Arrays.asList(new User("Becoder", 14), new User("Dipu", 19), new User("Liza", 45));

		/*
		 * boolean anyMatch = asList.stream().anyMatch(e ->
		 * e.getName().equals("Becoderc")); System.out.println(anyMatch);
		 */
		
		boolean anyMatch = asList.stream().noneMatch(e -> e.getName().equals("Becoder"));
		System.out.println(anyMatch);
		
	}
}
