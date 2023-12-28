package Constructorchaining;

public class Child4 extends Parent4 {
	Child4(int a)
	{
		System.out.println("constructor-3");
	}
	Child4()
	{
		this(10);
		System.out.println("Constructor-4");
	}
	public static void main(String[] args) {
		Child4 c=new Child4();
	}
}
