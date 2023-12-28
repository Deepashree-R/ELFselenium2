package Inheritance;

public class TestEngineer extends Emp {
public static void main(String[] args) {
	TestEngineer t=new TestEngineer();
	System.out.println(t.ename);
	System.out.println(t.eid);
	System.out.println(t.salary);
	t.ename="Deepa";
	t.eid=001;
	t.salary=100000;
	System.out.println(t.ename);
	System.out.println(t.eid);
	System.out.println(t.salary);
	
	
}
}
