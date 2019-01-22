import java.util.Scanner;
class StringInput
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\t\tEnter five names");
		String names[] = new String[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter "+(i+1)+" name:");
			names[i] = input.nextLine();
		}
		System.out.println("\t\tThe five names are");	
		for(String name : names)
			System.out.println(name);	
		
	}
}
