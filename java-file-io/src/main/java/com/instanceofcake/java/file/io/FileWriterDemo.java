package com.instanceofcake.java.file.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Satish_Nayak
 * 
 * FileWriter:
By using FileWriter object we can write character data to the file.
Constructors:
FileWriter fw=new FileWriter(String name);
FileWriter fw=new FileWriter(File f);
The above 2 constructors meant for overriding.
Instead of overriding if we want append operation then we should go for the following 2
constructors.
FileWriter fw=new FileWriter(String name,boolean append);
FileWriter fw=new FileWriter(File f,boolean append);
If the specified physical file is not already available then these constructors will create
that file.
 *
 *
 * The main problem with FileWriter is we have to insert line separator manually ,
which is difficult to the programmer. ('\n')
 And even line separator varing from system to system.
 */
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
	     File f = new File("cricket.txt");
	     FileWriter writer = new FileWriter(f, true);
	     
	     writer.write("I am bad ");
	     writer.write('\n');
	     writer.flush();
	     writer.close();
		

	}

}
