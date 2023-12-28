package ObjectClass;

import java.util.Objects;

public class Empp1 {
	String ename;
	int eid; 
	double salary;
	Empp1(String ename, int eid, double salary)
	{
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	//override equals
	public boolean equals(Object o) {
		Empp1 e=(Empp1)o;
		if(e.salary==this.salary)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//override hashCode
	public int hashCode()
	{
		return Objects.hash(salary);
	}
	public static void main(String[] args) {
		Empp1 e1=new Empp1("Soban", 1, 35000);
		Empp1 e2=new Empp1("Akash", 2, 38000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
}
}
