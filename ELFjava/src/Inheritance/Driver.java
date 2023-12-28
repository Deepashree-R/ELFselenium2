package Inheritance;

public class Driver {
public static void main(String[] args) {
	Parent p1=new Parent();
	p1.a=10;
	p1.b=20.2;
	p1.c=100;
	System.out.println(p1.a+" "+p1.b+" "+p1.c);
	Child c1=new Child();
	c1.a=5;
	c1.b=2.8;
	c1.c=50;
	System.out.println(c1.a+" "+c1.b+" "+c1.c);
	}
}
