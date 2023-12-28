package indexof_lastindexof_method;

public class Demo {
public static void main(String[] args) {
	String s="Harry";
	System.out.println(s.indexOf('H'));
	System.out.println(s.indexOf("a"));
	System.out.println(s.indexOf('y'));
	System.out.println(s.indexOf("Ha"));
	System.out.println(s.indexOf("ry"));
	System.out.println(s.indexOf("Harry"));
	System.out.println(s.indexOf("r"));
	System.out.println(s.lastIndexOf("r"));
	System.out.println(s.lastIndexOf("H"));
	System.out.println(s.indexOf("k"));
	
}
}
