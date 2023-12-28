package Constructorchaining;

public class Constructor {
Constructor()
{
	this(10);
	System.out.println("constructor-1");
}
Constructor(int a)
{
	System.out.println("constructor-2");
	System.out.println(a);
}
public static void main(String[] args) {
	Constructor c=new Constructor();
}
}
