package ObjectClass;

public class Empp {
String ename;
int eid; 
double salary;
Empp(String ename, int eid, double salary)
{
	this.ename=ename;
	this.eid=eid;
	this.salary=salary;
}
public static void main(String[] args) {
	Empp e1=new Empp("Soban", 1, 35000);
	Empp e2=new Empp("Akash", 2, 38000);
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	Empp e3=e2;
	System.out.println(e2.equals(e3));
	System.out.println(e2.hashCode());
	System.out.println(e3.hashCode());
}
}
