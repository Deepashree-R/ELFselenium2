package MethodRecurssion;

public class PrintName {
	public static void name(int num)
	{
//		if(num==0)
//		{
//		return;
//		}
//		System.out.println("Deepashree");
//		name(num-1);
		if(num!=0)
		{
			System.out.println("Deepa");
			name(num-1);
		}
		return;
	}
public static void main(String[] args) {
	name(5);
}
}
