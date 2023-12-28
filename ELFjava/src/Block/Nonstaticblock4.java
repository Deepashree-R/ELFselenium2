package Block;

public class Nonstaticblock4 {
int a=10;
{
	int a=20;
	a=30;
	//System.out.println(this.a);
}
{
	a=40;
}

public static void main(String[] args) {
	Nonstaticblock4 n=new Nonstaticblock4();
	System.out.println(n.a);
}
}
