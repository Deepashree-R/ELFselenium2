package Constructorchaining;

public class Child1 extends Parent1 {
Child1()
{
	System.out.println("constructor-3");
}
Child1(int a)
{
System.out.println("constructor-4");	
}
public static void main(String[] args) {
	Child1 c1=new Child1();
	Child1 c2=new Child1(6);
}
}
