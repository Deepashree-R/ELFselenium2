package Practice_programs3;

public class Constructor {
String ename;
String eid;
long salary;
public Constructor(String ename, String eid, long salary) {
	super();
	this.ename = ename;
	this.eid = eid;
	this.salary = salary;
	System.out.println("employee name is "+this.ename+" employee id is "+this.eid+" salary is "+this.salary);
}
public static void main(String[] args) {
	Constructor c1 = new Constructor("gowthami", "e001", 50000l);
	Constructor c2 = new Constructor("namrata", "e002", 40000l);
	Constructor c3 = new Constructor("archana", "e003", 100000);
	
}
}
