package com.predicate_examp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Prediecter_Example {

	public static void main(String[] args) {
//		Predicate<String> p = (name) -> name.length() > 7;
//		System.out.println(p.test("Pabitra"));

		// Q2- print name start with A

		/*
		 * String[] names = { "Kajal", "Anuskha", "Anupama", "Surya" };
		 * 
		 * Predicate<String> p = (name) -> name.startsWith("A");
		 * 
		 * for (String name : names) { if (p.test(name)) { System.out.println(name); } }
		 */

		// Q3- print person name who are eligilble for vote

		List<User> asList = Arrays.asList(new User("Becoder", 14), new User("Dipu", 19));

		Predicate<User> p = (u) -> u.getAge() > 18;

		for (User u : asList) {
			if (p.test(u)) {
				System.out.println(u);
			}
		}

	}

}
