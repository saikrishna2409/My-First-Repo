package javaapp;

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Hello hello =new Hello() {
			@Override
			public void display() {
				System.out.println("This is Inner Class");
			}
			
		};
		hello.display();*/
		/*Hello  h=() ->{
			System.out.println("This is Lambda Expression");
			System.out.println("This is Lambda Expression");
			System.out.println("This is Lambda Expression");
		};
		h.display();*/
	//	Runnable r =() ->System.out.println("I am Runnable Interface");
		//Thread t =new Thread(r);
	//t.start();
		//Hello  h=(int a,int b) ->a+b;
		//	System.out.println("This is Lambda Expression "+h.add(10,20));
	//	Hello h =(a,b) -> a+b;
		//System.out.println(h.add(10,20));
			Runnable r =()->{
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
					Thread.sleep(2000);
				}
			}
	}
		
	}

}
@FunctionalInterface
interface Hello
{
	//public void display();
	public int add(int a,int b);
}
