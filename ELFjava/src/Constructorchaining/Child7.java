package Constructorchaining;

public class Child7 extends Child6 {
	Child7(char ch)
	{
		super();
		System.out.println("Constructor-7");
	}
	Child7(char ch, double a)
	{
		this(ch);
		System.out.println("constructor-8");
	}
	public static void main(String[] args) {
		Child7 c=new Child7('A',20.5);
	}
}
