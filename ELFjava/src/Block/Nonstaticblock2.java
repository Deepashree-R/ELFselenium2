package Block;

public class Nonstaticblock2 {
	{
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}
	public static void main(String[] args) {
		Nonstaticblock2 n=new Nonstaticblock2();
		System.out.println("main method");
		Nonstaticblock2 n1=new Nonstaticblock2();
	}
}

