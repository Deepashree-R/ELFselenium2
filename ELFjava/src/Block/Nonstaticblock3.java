package Block;

public class Nonstaticblock3 {
int a=10;
{
	a=20;
}
{
	a=30;
}
public static void main(String[] args) {
	Nonstaticblock3 n=new Nonstaticblock3();
	System.out.println(n.a);
}
}
