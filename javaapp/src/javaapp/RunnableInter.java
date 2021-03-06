package javaapp;
import java.lang.*;

public class RunnableInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				//System.out.println("Main Thread");
				//Thread t =Thread.currentThread();
				//t.setPriority(Thread.MAX_PRIORITY-2);
				Resource resource =new Resource();
				FirstThread1 firstThread =new FirstThread1(resource);
				SecondThread1 secondThread =new SecondThread1(resource);
				Thread threadOne =new Thread(firstThread);
				Thread threadTwo =new Thread(secondThread);
			//	threadTwo.setPriority(Thread.MIN_PRIORITY+2);
				threadOne.start();
				threadTwo.start();
				//System.out.println("First Thread Priority : "+threadOne.getPriority());
				//Thread threadSecond;
				//System.out.println("Second Thread Priority : "+threadTwo.getPriority());
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
		class FirstThread1 implements Runnable
		{
			Resource resource;
			public FirstThread1(Resource resource) {
				this.resource=resource;
			}
			@Override
			public void run()
			{
			/*	for(int i=1;i<=10;i++)
				{
					if(i%2 !=0)
					System.out.println("First Thread : " +i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}*/
				resource.display("First Thread");
			}
		}
		class SecondThread1 implements Runnable
		{
			Resource resource;
			public SecondThread1(Resource resource) {
				this.resource=resource;
			}
			@Override
			public void run()
			{
				/*for(int i=1;i<=10;i++)
				{
					if(i%2 ==0)
					System.out.println("Second Thread : " +i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}*/
				resource.display("Second Thread");
			}

	}
		class Resource
		{
			public void display(String message)
			{
				synchronized(this)
				{
				for(int i=1;i<=5;i++)
				{
					System.out.println(message+ " "+i);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		}

