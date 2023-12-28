package Constructorchaining;

public class Child extends Parent {
Child()
{
	System.out.println("constructor-2");
}
public static void main(String[] args) {
	Child c=new Child();
}
}
