package MultilevelInheritance;

public class Child2 extends Child1 {
int c;
public static void main(String[] args) {
	Child2 c1=new Child2();
	System.out.println(c1.a);
	System.out.println(c1.b);
	System.out.println(c1.c);
	Child1 c2=new Child2();
	System.out.println(c2.a);
	System.out.println(c2.b);
	//System.out.println(c2.c);
	Parent p1=new Parent();
	System.out.println(p1.a);
	//System.out.println(p1.b);
	//System.out.println(p1.c);

	
	
}
}
