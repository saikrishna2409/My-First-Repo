package javaapp;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperations {

	public static  void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//FileSystem fs =FileSystems.getDefault();
		//Path path =fs.getPath("C:/Users/DELL/Desktop");
		Path path =Paths.get("C:/Users/DELL/Desktop");
		System.out.println("Name Count: "+path.getNameCount());
		System.out.println("Is Absolute : "+path.isAbsolute());
		System.out.println("Name on Index 2: "+path.getName(2));
		//Files files =Files.createFile("C:/Users/DELL/Desktop");
		//Files  files1 =Files.createDirectory(raj);
		//
		Files.createFile(path);
		

	}

}
