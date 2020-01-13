package javaapp;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.display();

	}

}
abstract class A
{
	public void show()
	{
		System.out.println("In class A");
	}
	abstract public void display();
	
}
class B extends A
{
	public void display()
	{
		System.out.println("In class B");
	}
}
