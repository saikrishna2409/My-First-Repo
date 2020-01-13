package javaapp;

public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread");
		FirstThread firstThread =new FirstThread();
		SecondThread secondThread =new SecondThread();
		firstThread.start();
		secondThread.start();
		/*for(int i =1;i<=5;i++)
		{
			System.out.println("Main Thread : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/

	}

}
class FirstThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2 !=0)
			System.out.println("First Thread : " +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class SecondThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2 ==0)
			System.out.println("Second Thread : " +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
