package javaapp;
class Out
{
	int x=10;
	static int y=20;
	 class Inner
	{
		public void display()
		{
		
			System.out.println(y);
		}
	}
}

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out outer =new Out();
		Out.Inner inner= outer.new Inner();
		inner.display();

	}

}
