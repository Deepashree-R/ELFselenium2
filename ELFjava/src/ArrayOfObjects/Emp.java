package ArrayOfObjects;

public class Emp {
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
	return "ename:"+this.ename+" "+"eid:"+this.eid+" "+"salary:"+this.salary;
}
public static void main(String[] args) {
	Emp e1=new Emp("Ramesh", 01, 20000);
	Emp e2=new Emp("Suresh", 02, 30000);
	Emp e3=new Emp("Mahesh", 03, 40000);
	Emp arr[]=new Emp[3];
	arr[0]=e1;
	arr[1]=e2;
	arr[2]=e3;
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
}
}
