package WrapperClass;

public class Autounboxing {
	public static void main(String[] args) {
		Integer a1=10;
		int a2=a1;
		System.out.println(a2);
		
		Double d1=30.55;
		double d2=d1;
		System.out.println(d2);
		
		char ch=new Character('a');
		System.out.println(ch);
	}
}
