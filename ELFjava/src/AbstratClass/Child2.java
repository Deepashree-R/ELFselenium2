package AbstratClass;

public class Child2 extends Child1 {
void m1()
{
	System.out.println("method-1");
}
void m2()
{
	System.out.println("method-2");
}
public static void main(String[] args) {
	Child1 c1=new Child2();
	c1.m1();
	c1.m2();
	Parent1 p1=new Child2();
	p1.m1();
	
}
}
