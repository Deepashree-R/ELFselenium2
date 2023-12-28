package Constructorchaining;

public class Parent3 {
	Parent3 (int a)
	{
		System.out.println("constructor-1");
		System.out.println(a);
	}
	Parent3(int a, double b)
	{
		System.out.println("constructor-2");
	}
	Parent3()
	{
		System.out.println("constructor-3");
	}
}
