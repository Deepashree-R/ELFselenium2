package Block;

public class Nonstaticblock5 {
int a=10;
{
	int a=20;
	this.a=this.a+a;
	System.out.println(a);
}
{
	int a=40;
	a=this.a;
	System.out.println(a);
}
public static void main(String[] args) {
	Nonstaticblock5 n=new Nonstaticblock5();
	System.out.println(n.a);
			
}
}
