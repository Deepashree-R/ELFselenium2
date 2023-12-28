package Interface;

public class Child implements I4 {
 public void m1()
{
	System.out.println("method-1");
}
public void m2()
{
	System.out.println("method-2");
}
public static void main(String[] args) {
	I4 i=new Child();
	i.m1();
	i.m2();
}
}
