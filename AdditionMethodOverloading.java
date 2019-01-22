class AdditionMethodOverloading
{
	int add(int a,int b)
	{
		int c = a+b;
		return c;
	}
	int add(int a,int ...b)
	{
		int sum=a;
		for(int s : b)
		{
			sum += s;
		}
		return sum;
	}
	public static void main(String args[])
	{
		AdditionMethodOverloading arith = new AdditionMethodOverloading();
		System.out.println("Sum of two numbers is "+arith.add(10,20));
		System.out.println("Sum of Three numbers is "+arith.add(10,30));
	
	}


}
