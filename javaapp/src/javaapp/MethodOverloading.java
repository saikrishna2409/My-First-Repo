package javaapp;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A e =new B();
		e.display();
		
	}

}
class A
{
	public void display()
	{
		System.out.println("This is Employee class");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("This is Manager Class");
	}
}
