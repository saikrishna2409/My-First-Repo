package javaapp;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		X x1 =new X();
		X x2 =new X();

		System.out.println(x1.KI);
		System.out.println(x2.KI);
		
	}
}
class X
{
	final double KI;
		X()
		{
			KI=4.5;
		}
		X(int a)
		{
			KI =5.5;
		}
	}



