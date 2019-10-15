package com.instanceofcake.java.file.io;

import java.io.File;
import java.io.IOException;

/**
 * 
This line 1st checks whether cricket.txt file is already available (or) not if it is already
available then "f" simply refers that file.
If it is not already available then it won't create any physical file just creates a java File
object represents name of the file.
 *
 */

public class NewFile {

	public static void main(String[] args) {
      File f = new File("cricket.txt");
      System.out.println(f.exists());
      try {
		f.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println(f.exists());

	}

}
