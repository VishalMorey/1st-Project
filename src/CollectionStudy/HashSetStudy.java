package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Vishal");
		hs.add(1998);
		hs.add('A');
		hs.add("Vishal");
		hs.add(null);
		hs.add(true);
		hs.add(2.198);
		hs.add("Morey");
		hs.add("bob");
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		//for loop does not support here----> get method is not available
		
		//for each loop 
		System.out.println("**********for each loop *************");
		for(Object s:hs)
		{
			System.out.println(s);
		}
		//iterator 
		System.out.println("=======iterator===========");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
