package programs;

public class Student implements Comparable {
String sname;
int rollNo;
double perc;
int Class;
public Student(String sname, int rollNo, double perc, int Class) {
	super();
	this.sname = sname;
	this.rollNo = rollNo;
	this.perc = perc;
	this.Class = Class;
}
public String toString()
{
	return "Student name:"+this.sname+" "+"RollNo:"+this.rollNo+" "+ "percentage:"+this.perc+" "+"Class:"+this.Class;
}

}
