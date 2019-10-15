package com.instanceofcake.java.file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Satish_Nayak
 * 
 *         By using FileReader object we can read character data from the file.
 * 
 *         int read(); It attempts to read next character from the file and
 *         return its Unicode value. If the next character is not available then
 *         we will get -1.
 * 
 *         As this method returns unicode value , while printing we have to
 *         perform type casting.
 * 
 *         int read(char[] ch); It attempts to read enough characters from the
 *         file into char[] array and returns the no of characters copied from
 *         the file into char[] array.
 *         
 *         Usage of FileWriter and FileReader is not recommended because :
1. While writing data by FileWriter compulsory we should insert line separator(\n)
manually which is a bigger headache to the programmer.
2. While reading data by FileReader we have to read character by character
instead of line by line which is not convenient to the programmer.
3. To overcome these limitations we should go for BufferedWriter and
BufferedReader concepts.
 *
 */
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("cricket.txt");
		FileReader reader = new FileReader(f);
		int read = reader.read();
		while (read != -1) {
	//		System.out.println((char) read);
			read = reader.read();
		}

		reader.close();
		
	

	}

}
