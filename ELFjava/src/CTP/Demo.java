package CTP;

public class Demo {
public static void method(int a) {
	System.out.println("method-1");
}
public static void method(int a, int b) {
	System.out.println("method-2");
}
public static void main(String[] args) {
	method(10);
	method(2,5);
}
}
