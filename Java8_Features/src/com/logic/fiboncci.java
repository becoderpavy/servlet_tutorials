package com.logic;

public class fiboncci {
	public static void main(String[] args) {
		int n = 10, ft = 0, st = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(ft + ",");

			int next = ft + st;
			ft = st;
			st = next;
		}
	}
}
