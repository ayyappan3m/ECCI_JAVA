import java.util.Scanner;
public class ThreeDArray
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\t\tEnter 3X3 matrix elements");
		int matrix[][] = new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				matrix[i][j] = input.nextInt();
		System.out.println("\t\tThe 3X3 matrix elements are");		
		for(int a[] : matrix)
		{	
			for(int b : a)
				System.out.print(b+"\t");
			System.out.println();			
		}
	}
}
