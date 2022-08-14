package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet li=new  LinkedHashSet();
		li.add("Sanu");
		li.add("Morey");
		li.add(8);
		li.add('A');
		li.add(null);
		li.add("Sanu");
		li.add(null);
		li.add(true);
		li.add(1998.2);
		li.add(8);
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.contains('A'));
		li.remove(null);
		System.out.println(li);
		
		System.out.println("==================");
		for (Object abc:li)
		{
			System.out.println(abc);
		}
		System.out.println("=====================");
		Iterator it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
