import java.util.Scanner;
public class CharacterSort
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a name:");
		String names = input.next();
		
		char name[] = names.toCharArray();
		for(int i=0;i<name.length-1;i++)
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i] > name[j])
				{
					char temp = name[i];
					name[i] = name[j];
					name[j] = temp; 
				}
			
			}
		System.out.``````````````````print("Sorted characters:");	
		System.out.println(name);	
	}
}
