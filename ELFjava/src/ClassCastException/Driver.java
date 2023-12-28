package ClassCastException;

public class Driver {
public static void main(String[] args) {
	Child c1=new Child();
	Parent p1=new Parent();
	Child c2=(Child) p1;
	System.out.println(c2.c);
	//System.out.println(c2.a);
}
}
