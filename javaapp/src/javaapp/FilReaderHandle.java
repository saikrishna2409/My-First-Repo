package  javaapp;
  
import java.io.FileReader;  
public class FileReaderHandle {

	public static void main(String args[])throws IOException{    
          FileReader fr=new FileReader("C:\\\\Users\\\\DELL\\\\Desktop\\\\data.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          {
          System.out.print((char)i);    
          }
          fr.close();    
    }    
}   