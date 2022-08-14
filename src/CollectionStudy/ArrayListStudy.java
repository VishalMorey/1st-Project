package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();//created on Object of  ArrayList
		
		al.add("Vishal");
		al.add(null);
		al.add(120);
		al.add(100.10);
		al.add(120);
		al.add("Vishal");
		al.add(null);
		al.add('A');
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		System.out.println(al.size()); //lenght 
	
		System.out.println(al.get(3));
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf('A'));
		System.out.println(al.contains("vishal"));//v smalll
		System.out.println(al.contains("Vishal"));
		  //remove the index of 2 (120)
		System.out.println(al.remove(2));  //index basic
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("==================");
		
		//addding
		al.add(3, "pune");
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println("====================");
		
		
	// printing element using for loop(static or hard coding )
		
		for (int i=0;i<=7;i++)
		{
			System.out.println(al.get(i));
			
			System.out.println("================");
			
			//printing element by using for loop (dynamic coding)
			
			for(int j=0;j<=al.size()-1;j++)
			{
				System.out.println(al.get(j));
			}
			
		}
		//for each loop
		System.out.println("=======================");
		System.out.println("FOR EACH LOOP OUTPUT ");
		
		for(Object v:al)
		{
			System.out.println(v);
		}
		// iterator 
		System.out.println("===========================");
		System.out.println("iterator output");
		Iterator it = al.iterator();
		while(it.hasNext())

		{
			System.out.println(it.next());
		}
		//listIterator
		System.out.println("=======================");
		System.out.println("listIterator output");
		
		ListIterator li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}
