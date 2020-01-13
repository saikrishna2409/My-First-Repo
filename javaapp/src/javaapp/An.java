package javaapp;
abstract class Test1
{
	abstract public void display();
	
}
public class An {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t =new Test1()
				{
					@Override
					public void display()
					{
						System.out.println("Good Morning");
					}
				};
			
		t.display();
				}
	}



