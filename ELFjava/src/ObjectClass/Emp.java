package ObjectClass;

public class Emp extends Object {
String ename;
int eid;
double salary;
Emp(String ename, int eid, double salary)
{
	this.ename=ename;
	this.eid=eid;
	this.salary=salary;
}
public String toString()
{
	return "Employee name is "+this.ename+" "+"eid is "+this.eid+" "+"salary is "+this.salary;
}
public static void main(String[] args) {
	Emp e1=new Emp("Akash", 001, 30000);
	System.out.println(e1.toString());
	Emp e2=new Emp("anu", 002, 40000);
	System.out.println(e2);
}
}
