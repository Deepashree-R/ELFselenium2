package CollectionFramework;

import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add(10);
	v1.addElement(20);
	v1.add(10);
	v1.add(50);
	v1.add("Hello");
	v1.add(true);
	System.out.println(v1);
	
	for(Object O:v1 )
	{
		System.out.println(O);
	}
	System.out.println("======");
	ListIterator i=v1.listIterator(v1.size());
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
			
}
}
