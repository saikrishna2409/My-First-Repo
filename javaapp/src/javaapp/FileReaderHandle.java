package  javaapp;
  
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
public class FileReaderHandle {

	public static void main(String args[])throws IOException{    
          FileReader fr=new FileReader("C:\\\\Users\\\\DELL\\\\Desktop\\\\data.txt"); 
          FileWriter fw =new FileWriter("copy.txt");
          int i;    
          while((i=fr.read())!=-1)    
          {
         // System.out.print((char)i);    
        	  fw.write(i);
          }
          fw.close();   
          fr.close();
    }    
}   