package com.marlabs.training;

import java.util.StringTokenizer;

public class Test2Demo {

	String str;

	public static String reverseWord(String str) {
		StringBuilder res = new StringBuilder();
		StringTokenizer token = new StringTokenizer(str, " ");
		while (token.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(token.nextToken());
			sb.reverse();
			res.append(sb);
			res.append(" ");
		}
		//System.out.println(res.toString());
		return res.toString();
	}

	public static int cube(int n) {
		return n * n * n;
	}
}
