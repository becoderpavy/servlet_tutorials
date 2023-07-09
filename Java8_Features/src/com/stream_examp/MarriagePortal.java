package com.stream_examp;

import java.util.stream.Stream;

public class MarriagePortal {
	public static void main(String[] args) {

		Person p1 = new Person("Raju", "Software", 32353245);
		Person p2 = new Person("Gopi", "Software", 32353245);
		Person p3 = new Person("Mahesh", "Software", 32353245);
		Person p4 = new Person("Sunil", "Photoshop", 32353245);

		Stream.of(p1, p2, p3, p4).filter(e -> e.getJob().equals("Software")).map(e -> e).forEach(System.out::print);

	}
}
