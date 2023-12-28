package UpcastingDowncasting;

public class Driver2 {
public static void main(String[] args) {
	Child2 c2=new Child2();
	System.out.println(c2.a);
	System.out.println(c2.b);
	System.out.println(c2.c);
	Child1 c1=c2;//upcasting
	Child2 c3=(Child2)c1;//downcasting
	System.out.println(c3.c);
	Parent p1=new Child2();//upcasting
	Child2 c4=(Child2)p1;//downcasting
	System.out.println(c4.c);
	System.out.println(c4.b);
	
}
}
