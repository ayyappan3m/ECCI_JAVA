import java.util.ArrayList;
import java.util.List;
class ListExample2
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
				
		list.add(9);
		list.add(2);
		
		System.out.println(list);
		
		System.out.println("Size of list "+list.size());
		
		
	}


}
