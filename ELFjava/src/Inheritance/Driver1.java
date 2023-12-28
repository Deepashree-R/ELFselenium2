package Inheritance;

public class Driver1 {
public static void main(String[] args) {
	Subclass s1=new Subclass();
	s1.a=10;
	s1.b=40.9;
	s1.f=37.9f;
	s1.ch='B';
	Superclass s2=new Superclass();
	s2.a=90;
	s2.b=50.9;
	//s2.f=90.9f;
	//s2.ch='d'
			System.out.println(s1.a+" "+s1.b+" "+s1.f+" "+s1.ch);
	System.out.println(s2.a+" "+s2.b);
			
	
}
}
