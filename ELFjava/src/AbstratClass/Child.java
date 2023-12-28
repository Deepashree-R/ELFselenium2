package AbstratClass;

public class Child extends Parent{
void method1()
{
	System.out.println("method-2");
}
public static void main(String[] args) {
	Child c1=new Child();
	//c1.method();
	c1.method1();
	Parent p1=c1;
	//p1.method();
	p1.method1();
}
}
