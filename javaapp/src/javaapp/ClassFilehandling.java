package javaapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClassFilehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path ="C:\\Users\\DELL\\Desktop\\data.txt";
		/*File file =new File(path);
		System.out.println("Can Execute ?:"+file.canExecute());
		System.out.println("Can Read ?:"+file.canRead());
		System.out.println("Can Write ?:"+file.canWrite());
		System.out.println("Can Exists ?:"+file.exists());
		System.out.println("Can Abosulte path ?:"+file.getAbsolutePath());
		System.out.println("File Name ?:"+file.getName());
		System.out.println("Write Data:");
		FileOutputStream fout =new FileOutputStream(file,true);
		//String msg="Welcome to file handling";
		Scanner sc =new Scanner(System.in);
		String msg =sc.nextLine();
		byte [] b =msg.getBytes();
		fout.write(b);
		fout.close();*/
		FileInputStream fin =new FileInputStream(path);
		FileOutputStream fout =new FileOutputStream("copied.txt");
		int i;
		while((i=fin.read()) != -1)
		{
			fout.write(i);
		}
		fout.close();
		fin.close();
	}

}
