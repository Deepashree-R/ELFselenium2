package ObjectClass;

public class Student extends Object {
String studentname;
int studentid;
int standard;
Student(String studentname, int studentid, int standard )
{
	this.studentname=studentname;
	this.studentid=studentid;
	this.standard=standard;
}
public String toString()
{
	return "student name is "+studentname+" Student id is "+studentid+" stanadard is "+standard;
}
public static void main(String[] args) {
	Student s1=new Student("Megha", 001, 05);
	Student s2=new Student("Swetha", 002, 04);
	Student s3=new Student("Akshay", 003, 03);
	System.out.println(s1.toString());
	System.out.println(s2);
	System.out.println(s3);
}
}
