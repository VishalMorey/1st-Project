package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistStudy {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("Vishal");
		ll.add(1998);
		ll.add('A');
		ll.add("Vishal");
		ll.add(null);
		ll.add(true);
		ll.add(2.198);
		ll.add("Morey");
		ll.add("bob");
		
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(1,"Morey");
		System.out.println(ll);
		ll.remove(8);
		System.out.println(ll);
		System.out.println("========peek===================");
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println("==========poll=============");
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		
		//for loop
		System.out.println("========for loop==========");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
			
		}
		//for each loop
		System.out.println("===========for each loop==============="); 
		for(Object v:ll)
		{
			System.out.println(v);
		}
		//iterator
		System.out.println("==========iterator=============");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//ListIterator
		System.out.println("=========ListIterator===========");
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}