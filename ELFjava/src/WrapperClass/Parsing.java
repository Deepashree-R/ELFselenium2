package WrapperClass;

public class Parsing {
public static void main(String[] args) {
	String s1="10";
	System.out.println(s1+20);
	int i=Integer.parseInt(s1);
	System.out.println(i+20);
	
	String s2="10.4";
	double d=Double.parseDouble(s2);
	System.out.println(d+20.5);
}
}
