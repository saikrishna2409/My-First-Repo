package javaapp;
interface Test2
{
	 void display();
	
}
public class Ano{

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



