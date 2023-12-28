package programs;

import java.util.Scanner;

public class SwappingString {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter two words");
String s1=sc.nextLine();
String s2=sc.nextLine();
System.out.println("before swapping");
System.out.println("s1:"+s1);
System.out.println("s2:"+s2);
s1=s1+s2;
s2=s1.substring(0, s1.length()-s2.length());
s1=s1.substring(s2.length());
System.out.println("After swapping");
System.out.println("s1:"+s1);
System.out.println("s2:"+s2);
}
}
