package javaapp;

public class ThreadDemo {
//Daemon Thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =Thread.currentThread();
		System.out.println(thread);
		System.out.println("Thread Name : "+thread.getName());
		thread.setName("CTS Thread");
		System.out.println("Thread Name : "+thread.getName());
		System.out.println("Is thread Daemon : "+thread.isDaemon());
		System.out.println("Is thread alive : "+thread.isAlive());
		System.out.println("Thread State : "+thread.getState());
		System.out.println("Thread Id : "+thread.getId());
		

	}

}
