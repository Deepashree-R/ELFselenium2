package HierarichalInheritance;

public class Driver {
public static void main(String[] args) {
	Child1 c1=new Child1();
	System.out.println(c1.a);
	System.out.println(c1.b);
	//System.out.println(c1.c);
	Child2 c2=new Child2();
	System.out.println(c2.a);
	//System.out.println(c2.b);
	System.out.println(c2.c);
	Parent p1=new Parent();
	System.out.println(p1.a);
	//System.out.println(p1.b);
	//System.out.println(p1.c);
}
}
