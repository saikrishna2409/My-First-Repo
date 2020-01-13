package javaapp;

public class ExceptionDemo {
	public static boolean isValidUser(String user) throws InvalidUser
	{
		if(!user.contentEquals("admin")) {
			throw new InvalidUser();
	}
		else
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			isValidUser("admine");
		}
		catch(InvalidUser e)
		{
			System.out.println(e.invalid());
		}

	}

}
class InvalidUser extends Exception
{
	public InvalidUser() 
	{
		
	}
	
	InvalidUser(String message)
	{
		System.out.println(message);
	}
	public String invalid()
	{
		return "This user is Invalid";
	}
	
}