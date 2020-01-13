package javaapp;

import javaapp.Out.Inner;

class Ot
{
	int x=10;
	static int y=20;
	
		public void display()
		{
			 class In
				{
				 public void show()
				 {
					 System.out.println(x);
					 System.out.println(y);
				 }
				}
			 In m =new In();
			 m.show();
		}
}

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ot outer =new Ot();
		
		outer.display();

	}

}
