package WrapperClass;

public class Unboxing {
public static void main(String[] args) {
	Integer a1=10;
	int a2=a1.intValue();
	System.out.println(a2);
	
	Double d1=30.55;
	double d2=d1.doubleValue();
	System.out.println(d2);
	
	Character ch='a';
	char c=ch.charValue();
	System.out.println(ch);
}
}
