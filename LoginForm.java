import login.Validation;
import java.util.Scanner;
public class LoginForm
{
	public static void main(String args[])
	{
		Validation val = new Validation();
		Scanner input = new Scanner(System.in);
		System.out.print("USER NAME:");
		String username = input.nextLine();
		System.out.print("PASSWORD:");
		String password = input.nextLine();
		if(val.validate(username,password))
			System.out.println("Valid");
		else
			System.out.println("Invalid");	
		
	}
}
