package Block;

public class Staticblock5 {
static int a=10;
static {
	int a=20;
	Staticblock5.a=a;
	System.out.println(a);
}
static {
	a=30;
}
public static void main(String[] args) {
	System.out.println(a);
}
}
