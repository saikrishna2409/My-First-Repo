package javaapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffReader {

		public static void main(String[] args) throws IOException {     
		    FileWriter writer = new FileWriter("C:\\Users\\DELL\\Desktop\\data.txt");  
		    BufferedWriter buffer = new BufferedWriter(writer);  
		    buffer.write("Welcome ");  
		    buffer.close();  
		    System.out.println("Success");  
		    }   

	}
