package com.instanceofcake.java.file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Satish_Nayak
 * 
 * By using BufferedWriter object we can write character data to the file.
 * 
 * Note: BufferedWriter never communicates directly with the file it should communicates
via some writer object.

Note : When ever we are closing BufferedWriter automatically underlying writer will be
closed and we are not close explicitly.
 *
 */
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("cricket.txt",true);
		BufferedWriter buffWriter = new BufferedWriter(writer);
		
		buffWriter.write("Hey You");
		buffWriter.newLine();
		buffWriter.flush();
		buffWriter.close();
		
		

	}

}
