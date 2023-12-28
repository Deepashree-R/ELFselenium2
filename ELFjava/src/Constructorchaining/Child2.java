package Constructorchaining;

public class Child2 extends Parent2 {
Child2(int a)
{
	super(15);
	System.out.println("constructor-2");
}
public static void main(String[] args) {
	Child2 c=new Child2(10);
}
}
