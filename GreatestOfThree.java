import java.util.Scanner;
class GreatestOfThree
{
 
	public static void main(String args[])
    {
       	Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three numbers:");
        System.out.print("A=");
        int a=sc.nextInt();
        System.out.print("B=");
        int b=sc.nextInt();
        System.out.print("C="); 
        int c=sc.nextInt();
        if(a==b && a==c)
           	System.out.println("A,B,C are greater");
        else if(a==b && c<a)
            System.out.println("A B are greater");
        else if(a==c && b<a)
            System.out.println("A C are greater");
        else if(b==c && a<b)
            System.out.println("B C are greater");
        else if(a>b &&a>c)
            System.out.println("A is greater");
        else if(b>c)
            System.out.println("B is greater");    
        else
            System.out.println("C is greater");
                

    }
}
