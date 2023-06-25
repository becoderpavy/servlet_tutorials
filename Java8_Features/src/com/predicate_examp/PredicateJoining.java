package com.predicate_examp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		// four method have negate, test, and, or method

		List<User> asList = Arrays.asList(new User("Becoder", 14), new User("Dipu", 19), new User("Liza", 45));

		Predicate<User> ageLowerLimit = (p) -> p.getAge() >= 18;
		Predicate<User> ageUpperLimit = (p) -> p.getAge() <= 64;

		for (User u : asList) {
			Predicate<User> predicate = ageLowerLimit.and(ageUpperLimit);
			if (predicate.test(u)) {
				System.out.println(u);
			}
		}

		Predicate<Integer> evenPredicate = (i) -> i % 2 == 0;

		System.out.println(evenPredicate.negate().test(6));

	}

}
