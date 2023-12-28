package Methodoverriding;

public class Driver {
public static void main(String[] args) {
	Parent p1=new Parent();
	p1.method();
	Child1 c1=new Child1();
	c1.method();
	p1=c1;
	p1.method();
	Parent p3=new Child2();
	p3.method();
	
}
}
