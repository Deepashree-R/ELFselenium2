package TypesofInheritance;

public class Child extends Parent {
int c; 
int d;
public static void main(String[] args) {
	Child c1=new Child();
	System.out.println(c1.a);
	System.out.println(c1.b);
	System.out.println(c1.c);
	System.out.println(c1.d);
	Parent p1=new Parent();
	System.out.println(p1.a);
	System.out.println(p1.b);
}
}
