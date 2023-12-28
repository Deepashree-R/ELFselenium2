package Interface;

public class D implements B,C {
public void m1()
{
	System.out.println("method-1");
}
public void m2()
{
	System.out.println("method-2");
}
public void m3()
{
	System.out.println("method-3");
}
public static void main(String[] args) {
	A a=new D();
	a.m1();
	//a.m2();
	//a.m3();
	B b=new D();
	b.m1();
	b.m2();
	//b.m3();
	C c=new D();
	c.m1();
	//c.m2();
	c.m3();
	
}
}
