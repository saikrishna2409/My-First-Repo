package javaapp;
class Test
{
	public void display()
	{
		System.out.println("Hello");
	}
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t =new Test()
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



