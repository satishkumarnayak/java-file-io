package com.instanceofcake.java.file.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Satish_Nayak
 * 
 *         This is the most enhanced(better) Reader to read character data from
 *         the file.
 * 
 *         Note: BufferedReader can not communicate directly with the File it
 *         should communicate via some Reader object. The main advantage of
 *         BufferedReader over FileReader is we can read data line by line
 *         instead of character by character.
 *
 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("cricket.txt");
		BufferedReader buffReader = new BufferedReader(reader);

		String readLine = buffReader.readLine();
		while (readLine != null) {
			System.out.println(readLine);
			readLine = buffReader.readLine();
		}

		buffReader.close();

	}

}
