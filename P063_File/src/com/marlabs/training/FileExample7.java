//CharArrayReader:- It reads array of character.

package com.marlabs.training;

import java.io.*;

public class FileExample7 {
	public static void main(String[] args) throws Exception {
		char x[] = { 't', 'h', 'i', 's', 'a', 'f', 'i', 'l', 'e', 'p', 'r', 'g' };
		CharArrayReader red = new CharArrayReader(x);
		int y = 0;
		while ((y = red.read()) != -1) {
			System.out.println(y);
			char p = (char) y;
			System.out.println(p);
			System.out.println("*********************************");
		}
	}
}