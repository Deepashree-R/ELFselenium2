package Practice_programs3;

public class Perimer {
public static void circle(int r)
{
	final double pi=3.14;
	System.out.println("area of circle is "+pi*r*r);
	System.out.println("perimer of circle is "+2*pi*r );
	
}
public static void square(int a)
{
	System.out.println("area of square is "+a*a);
	System.out.println("perimeter of square is "+4*a);
}
public static void triangle(int b, int h, int s1, int s2)
{
	System.out.println("area of triangle is "+0.5*b*h);
	System.out.println("perimeter of triangle "+s1+s2+b);
}
public static void main(String[] args) {
	circle(10);
	square(2);
	triangle(2,3,5,3);
}
}
