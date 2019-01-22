package login;
public class Validation
{
	public boolean validate(String username,String password)  
	{
		if(username.equalsIgnoreCase(password))
			return true;
		else
			return false;
	}
}
