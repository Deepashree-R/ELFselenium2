package Methodoverriding;

public class Demo {
public static void main(String[] args) {
	Father f1=new Father();
	f1.light();
	Son s1=new Son();
	s1.light();
	f1=s1;
	f1.light();
}
}
