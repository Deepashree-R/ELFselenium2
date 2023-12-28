package Constructorchaining;

public class Child3 extends Parent3 {
	Child3()
	{
		super(10);
		System.out.println("constructor-4");
	}
	Child3(int a)
	{
		super(a,20.5);
		System.out.println("constructor-5");
	}
	Child3(int a, double b)
	{
		System.out.println("constructor-6");
	}
	public static void main(String[] args) {
		Child3 c1=new Child3();
		Child3 c2=new Child3(10);
		Child3 c3=new Child3(10, 20.5);
	}
}
