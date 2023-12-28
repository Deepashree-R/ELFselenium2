package Constructorchaining;

public class Parent4 {
	Parent4()
	{
		this(10);
		System.out.println("constructor-1");
	}
	Parent4(int a)
	{
		System.out.println("constructor-2");
	}
}
