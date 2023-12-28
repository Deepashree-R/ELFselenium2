package startswith_endswith_method;

public class Demo {
public static void main(String[] args) {
	String s="Harry";
	System.out.println(s.startsWith("H"));
	System.out.println(s.startsWith("ha"));
	System.out.println(s.startsWith("Ha"));
	System.out.println(s.startsWith("y"));
	System.out.println(s.endsWith("y"));
	System.out.println(s.endsWith("ry"));
	
}
}
