import java.util.Scanner;
class LeapOrNot
{ 
	public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
                System.out.print("Enter a year:");
                int year=sc.nextInt();
                if(year%4==0)
                {
                	if(year%400==0)
                        	System.out.println("Leap year");
                 	else
                        {
                        	if(year%100!=0)
                        	        System.out.println("Leap year");
                                else   
                                	System.out.println("Not a leap year");
                      
                        } 
                }
                else
                	System.out.println("Not a leap year");
            

         }
}
