package com.instanceofcake.java.file.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Satish_Nayak
 * 
 *  This is the most enhanced Writer to write text data to the file.
 By using FileWriter and BufferedWriter we can write only character data to the
File but by using PrintWriter we can write any type of data to the File.

note - PrintWriter can communicate either directly to the File or via some Writer object also.
What is the difference between write(100) and print(100)?
In the case of write(100) the corresponding character "d" will be added to the File but
in the case of print(100) "100" value will be added directly to the File.

Note 1:
1. The most enhanced Reader to read character data from the File is
BufferedReader.
2. The most enhanced Writer to write character data to the File is PrintWriter.

Note 2:
1. In general we can use Readers and Writers to handle character data. Where as
we can use InputStreams and OutputStreams to handle binary data(like images,
audio files, video files etc).
2. We can use OutputStream to write binary data to the File and we can use
InputStream to read binary data from the File.
 *
 */


public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
	
		FileWriter writer = new FileWriter("cricket.txt", true);
		PrintWriter out = new PrintWriter(writer);
		
		out.write(100);
		out.print(100);
		out.print("Hows is life going ?");
		
		out.close();

	}

}
