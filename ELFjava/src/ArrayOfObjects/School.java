package ArrayOfObjects;

public class School {
String sname;
int rollno;
int Class;
public School(String sname, int rollno, int Class) {
	super();
	this.sname = sname;
	this.rollno = rollno;
	this.Class = Class;
}
public String toString()
{
	return "student name "+this.sname+" "+"rollno "+this.rollno+" "+"Class "+this.Class;
}
public static void main(String[] args) {
	School arr[]= {new School("ravi", 01, 05), new School("kavi", 02, 07), new School("Savi", 03, 8)};
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	}

}
