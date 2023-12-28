package Block;

public class Nonstaticblock {
	{
		System.out.println("Hey");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Nonstaticblock n=new Nonstaticblock();
	}

}
