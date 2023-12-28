package CollectionFramework;

import java.util.ArrayList;

public class arrayList6 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	System.out.println(a1);
	//System.out.println(a1.get(0)+a1.get(1));
	Integer i1=(Integer)a1.get(0);
	Integer i2=(Integer)a1.get(1);
	int firstnum=i1;
	int secondnum=i2;
	System.out.println(firstnum+secondnum);
	
}
}
