package CollectionFramework;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList<>();
	a1.add(10);
	a1.add(20);
	a1.add(true);
	a1.add("Hello");
	a1.add(20);
	System.out.println(a1.size());
	System.out.println(a1.toString());
	System.out.println(a1.get(0));
	System.out.println(a1.get(2));
	//System.out.println(a1.get(size()));
	for(int i=0; i<a1.size(); i++ )
	{
		System.out.println((a1.get(i)));
	}
}
}
