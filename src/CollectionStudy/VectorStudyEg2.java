package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudyEg2 {

	public static void main(String[] args) {
		Vector<String> ve=new Vector<>();
		ve.add("Vishal");
		ve.add("Ashok");
		ve.add("Morey");
		ve.add("India");
		ve.add("Maharashtra");
		ve.add("Chandrapur ");
		ve.add("Rajura");
		ve.add("Satri");
		System.out.println(ve);
		System.out.println(ve.size());
		
		//for loop 
		System.out.println("================");
		for(int i=0;i<=ve.size()-1;i++)
		{
			System.out.println(ve.get(i));
		}
		System.out.println("========================");
		//for each loop
		for(String s:ve)
		{
			System.out.println(s);
		}
		//iterator
		System.out.println("===================");
		Iterator<String> ab = ve.iterator();
		while(ab.hasNext())
		{
			System.out.println(ab.next());
		}
		//ListIreator
		System.out.println("=======================");
		ListIterator<String> li = ve.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		//enumeration
		System.out.println("====================");
		Enumeration<String> ele = ve.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
	}

}
