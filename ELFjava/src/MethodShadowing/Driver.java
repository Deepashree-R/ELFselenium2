package MethodShadowing;

public class Driver {
public static void main(String[] args) {
	Parent p1=new Parent();
	p1.method();
	Child c1=new Child();
	c1.method();
	p1=c1;
	p1.method();
}
}
