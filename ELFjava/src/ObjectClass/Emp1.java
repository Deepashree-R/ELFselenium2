package ObjectClass;

public class Emp1 {
String ename;
int eid;
double salary;
Emp1(String ename, int eid, double salary)
{
	this.ename=ename;
	this.eid=eid;
	this.salary=salary;
}
public static void main(String[] args) {
Emp1 e1=new Emp1("parag", 001, 35000);
Emp1 e2=new Emp1("Arun", 002, 35000);
System.out.println(e1.equals(e2));
Emp1 e3=e2;
System.out.println(e2.equals(e3));
}
}
