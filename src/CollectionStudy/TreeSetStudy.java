package CollectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet tr =new TreeSet();
		tr.add(2000);
		tr.add(2001);
		tr.add(2002);
		tr.add(2003);
		tr.add(2004);
		tr.add(2005);
		tr.add(2006);
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		System.out.println(tr.pollFirst());
		System.out.println(tr);
		System.out.println(tr.pollLast());
		System.out.println(tr);
		System.out.println("=====for each loop=========");
		for(Object tree:tr)
		{
			System.out.println(tree);
		}
		System.out.println("==========iterator==============");
		Iterator it = tr.iterator();
		while(it.hasNext())
			{
			System.out.println(it.next());
			}
		
	}

}
