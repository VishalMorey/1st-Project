package CollectionStudy;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEg1 {



	public static void main(String[] args) {
		
		ArrayList<Integer> ab=new ArrayList<>();
		ab.add(120);
		ab.add(130);
		ab.add(140);
		ab.add(150);
		ab.add(160);
		ab.add(170);
		ab.add(180);
		ab.add(190);
		
		System.out.println(ab);
		System.out.println(ab.size());
		ab.remove(2);
		System.out.println(ab);
		ab.add(0, 100);
		System.out.println(ab);
		
		for(int i=0;i<=ab.size()-1;i++)
		{
			System.out.println(ab.get(i));
		}
		System.out.println("===================");
		//for each loop
		for(Integer a:ab)
		{
			System.out.println(a);
		}
		System.out.println("====================");
		//iterator
		Iterator<Integer> it = ab.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====================");
		//ListIterator
		ListIterator<Integer> li = ab.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
 
	}

}
