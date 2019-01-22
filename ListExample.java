import java.util.ArrayList;
import java.util.List;
class ListExample
{
	public static void main(String args[])
	{
		List list = new ArrayList();
		List list1 = new ArrayList();
		list1.add("ten");
		list1.add("eleven");
		list.add("one");
		list.add("two");
		//add all the element in another list
		list.addAll(list1);
		
		list.add("three");
		list.add(2,"four");
		
		System.out.println(list);
		
		//after romoved first
		list.remove(0);
		
		list.remove(list1);
		System.out.println(list);
		System.out.println("Size of list "+list.size());
		
		
	}


}
