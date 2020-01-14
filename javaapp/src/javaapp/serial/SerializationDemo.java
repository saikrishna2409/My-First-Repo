package javaapp.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javaapp.Em;

public class SerializationDemo {
	public static Object deserializable(String fileName) throws IOException
	{
		FileInputStream fin =new FileInputStream(fileName);
		BufferedInputStream bin =new BufferedInputStream(fin);
		ObjectInputStream ois =new ObjectInputStream(bin);
		return null;
	}
	public static void serializable(Object obj,String fileName)throws IOException
	{
		FileOutputStream fout =new FileOutputStream(fileName);
		BufferedOutputStream bout =new BufferedOutputStream(fout);
		ObjectOutputStream out =new ObjectOutputStream(bout);
		out.writeObject(obj);
				out.close();
				bout.close();
				fout.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Em em =new Em(1111,"Sai Ram","Kohlapur",22,567576L,123456);
		try {
		serializable(em,"serial.txt");
		Em emp =(Em)deserializable("serial.txt");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
//	private static void serialize(Em em, String string) {
//		// TODO Auto-generated method stub
//		
//	}

}
	