package ExceptionHandling;

public class Demo1 {
public static void main(String[] args) {
	try
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(1/0);
		System.out.println(4);
		System.out.println(5);
	}
	catch(Exception e)
	{
		System.out.println("exception handled");
	}
	System.out.println(6);
	System.out.println(7);
}
}
