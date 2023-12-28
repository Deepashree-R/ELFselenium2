package ObjectClass;

public class Emp2 {
	String ename;
	int eid;
	double salary;
	Emp2(String ename, int eid, double salary)
	{
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	public boolean equals(Object o)
	{
		Emp2 e=(Emp2)o;
		if(e.salary==this.salary)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
	Emp2 e1=new Emp2("prateek", 001, 35000);
	Emp2 e2=new Emp2("Arun", 002, 35000);
	System.out.println(e1.equals(e2));
}
}