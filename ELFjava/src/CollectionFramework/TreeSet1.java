package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(10);
	t.add(31);
	t.add(2);
	t.add(1);
	t.add(5);
	t.add(7);
	System.out.println(t);
	System.out.println("printing element in acending order");
	Iterator i1=t.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	System.out.println("printing element in descending order");
	Iterator i2=t.descendingIterator();
//	while(i2.hasNext())
//	{
//		System.out.println(i2.next());
//	}
}
}
