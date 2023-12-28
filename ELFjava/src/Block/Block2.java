package Block;

public class Block2 {
	static
	{
	System.out.println("SIB-1");	
	}
	static
	{
		System.out.println("SIB-2");
	}
	public Block2()
	{
		System.out.println("constructor-1");
	}
	{
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}
	public Block2(int a)
	{
		System.out.println("constructor-2");
	}
	public static void main(String[] args) {
		Block2 b1=new Block2();
		System.out.println("main method");
		Block2 b2=new Block2(5);
	}
}
