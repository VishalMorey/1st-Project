package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("BOB");
		v.add(180);
        v.add(90);
        v.add("MOREY");
        v.add('A');
        v.add(99.99);
        v.add(null);
        
        System.out.println(v);
        System.out.println(v.size());
        v.remove(0);
        System.out.println(v);
        v.add(5, 'C');
        System.out.println(v);
       // for loop
        System.out.println("=================");
        for(int i=0;i<=v.size()-1;i++)
        {
        	System.out.println(v.get(i));
        }
        //for each loop
        System.out.println("==================");
        System.out.println("for each loop");
        for(Object ab:v)
        {
        	System.out.println(ab);
        }
        //iterator using
        System.out.println("====================");
        
        System.out.println("iterator output");
       Iterator it = v.iterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
        
	  //ListIterator using
       System.out.println("====================");
       System.out.println("listIreator output");
      ListIterator li = v.listIterator();
	   while(li.hasNext())
	   {
		   System.out.println(li.next());
	   }
	   // enumeration
	   System.out.println("======================");
	  Enumeration ele = v.elements();
	   while(ele.hasMoreElements())
	   {
		   System.out.println(ele.nextElement());
	   }
	   
	}

}
