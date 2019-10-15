package com.instanceofcake.java.file.io;

import java.io.File;
import java.io.IOException;

/**
 * A java File object can represent a directory also.
Note: in UNIX everything is a file, java "file IO" is based on UNIX operating system
hence in java also we can represent both files and directories by File object only.
 *
 */

public class NewDirectory {

	public static void main(String[] args) {
		File f = new File("cricket");
		File f1 = new File("cricket2");
		System.out.println(f.exists());
		f.mkdir();
		f1.mkdir();
		System.out.println(f.exists());
		File  f3 = new File("D:\\work\\git_repos\\java-file-io\\java-file-io"); 
		System.out.println(f3.exists());
		String[] list = f3.list();
		for (String fi : list) {
			
			System.out.println(fi);
		}
	}

}
