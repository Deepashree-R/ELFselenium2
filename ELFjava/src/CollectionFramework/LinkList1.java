package CollectionFramework;

import java.util.LinkedList;

public class LinkList1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add("hello");
	System.out.println(l1);
	l1.addFirst(100);
	System.out.println(l1);
	l1.addLast(50.9);
	System.out.println(l1);
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
}
}
