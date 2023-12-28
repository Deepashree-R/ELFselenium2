package Encapsulation;

public class Student {
public static void main(String[] args) {
	College c1=new College("Megha", 01, 1, 0, "CS");
	College c2=new College("swetha", 02, 2, 1, "IS");
	College c3=new College("Vidya", 03, 3, 2, "IT");
	College c4=new College("divya", 04, 4, 3, "Mech");
	College c5=new College("Bhavya", 05, 5, 4, "Civl");
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	c1.setsname("Archana");
	System.out.println(c1);
}
}
