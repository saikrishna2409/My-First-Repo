package javaapp.test;

public class GeneralAPI {
	public int add(int a,int b)
	{
		return a+b;
	}
	public boolean checkEven(int num)
	{
		if(num%2 ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int getFactorial(int num)
	{
		if(num==1)
		{
			return 1;
		}
		return num*getFactorial(num-1);
	}
	public boolean getPrime(int num)
	{
		boolean status =true;
		if(num <=1)
		{
			status =false;
			return status;
		}
		else
		{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i ==0)
				status =true;
			break;
		}
		return status;
		}
	}
}
