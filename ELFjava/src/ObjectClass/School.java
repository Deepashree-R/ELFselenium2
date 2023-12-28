package ObjectClass;

public class School {
String sname;
double per;
int rollno;
int std;
School(String sname, double per, int rollno, int std){
	this.sname=sname;
	this.per=per;
    this.rollno=rollno;
	this.std=std;
}
public String toString()
{
	return "Student name is "+this.sname+" percentage is "+this.per+" roll no is "+this.rollno+" standard is "+this.std;
}
public boolean equals(Object o)
{
	School s=(School)o;
	if(s.per==this.per & s.sname==this.sname)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static void main(String[] args) {
	School s1=new School("Aditya", 91.8, 23, 7);
	School s2=new School("Aditya", 91.8, 30, 5);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.equals(s2));
	School s3=new School("asit", 91.8, 23, 7);
	System.out.println(s2.equals(s3));
}
}
