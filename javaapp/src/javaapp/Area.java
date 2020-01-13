package javaapp;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kri a =new Kri();
		a.area(2,2);

	}

}
class Kri
{
	public static final double PI=3.14;
	public void area(double a)
	{
		System.out.println("The area of square is"+(a*a));
	}
	public void area(double a,double b)
	{
		System.out.println("The area of rectangle is"+(a*b));
	}
	public void area(int a,float b)
	{
		System.out.println("The area of triangle is"+(a*b));
	}
	public void area(int a)
	{
		System.out.println("The area of circle is"+(PI*a*a));
	}
}
