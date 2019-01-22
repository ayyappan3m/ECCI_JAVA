import java.util.ArrayList;
import java.util.List;
class ListExample1
{
	public static void main(String args[])
	{
		List list = new ArrayList();
		
		list.add(new Integer(5));
		list.add(new Float(10.78F));
		list.add("one");
		list.add("two");
				
		list.add("three");
		list.add(2,"four");
		
		System.out.println(list);
		
		System.out.println("Size of list "+list.size());
		
		
	}


}
