import java.util.Scanner;
class Grades
{
 
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a mark:");
        int mark=sc.nextInt();
        if(mark>80 && mark<=100)
           	System.out.println("Excellent");
        else if(mark>60 && mark<=80)
            System.out.println("Good");
        else if(mark>40 && mark<=60)
            System.out.println("Fair");
        else if(mark>=0 && mark<=40)
            System.out.println("Poor");  
        else
	        System.out.println("Invalid Marks");
                

    }
}
