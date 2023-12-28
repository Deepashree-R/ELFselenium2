package CollectionFramework;

import java.util.ArrayList;

public class ArrayList12 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	
	ArrayList a2=new ArrayList();
	a2.add(50);
	a2.add(60);
	System.out.println(a2);
	
	a2.addAll(a1);
	System.out.println(a2);
	System.out.println(a2.size());
	System.out.println(a2.containsAll(a1));
	System.out.println(a1.containsAll(a2));
	
	
}
}
