package Substringmethod;

public class Demo2 {
public static void main(String[] args) {
	String s="rahul";
	s=s.substring(0, 1).toUpperCase()+s.substring(1);
	System.out.println(s);
	//s=s.charAt(0).toUpperCase()+s.substring(1);
	
}
}
