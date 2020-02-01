package KBAbasics;
import java.util.Scanner;
public class Asciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		char a[] =new char[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next().charAt(0);
		}
		for(int i=0;i<a.length;i++)
		{
			int value =(int) a[i];
		
		System.out.println(value);
		}

	}

}
