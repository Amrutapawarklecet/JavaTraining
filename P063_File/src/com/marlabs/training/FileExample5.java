/*character stream
------------------------------
1)Reader 2)writer
*/
package com.marlabs.training;

import java.io.*;

public class FileExample5 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("student1.txt");
		BufferedReader br = new BufferedReader(fr);
		String x;
		while ((x = br.readLine()) != null) // null indicates EOF
		{
			System.out.println(x);
		}
	}
}
