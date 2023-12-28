package containsmethod;

public class Removeduplicate {
public static void main(String[] args) {
	String s1="Hello Hi Hello How Hi are you";
	String s2=" ";
	String arr[]=s1.split(" ");
	for(int i=0; i<arr.length; i++)
	{
		if(s2.contains(arr[i])==false)
		{
		s2=s2+arr[i]+" ";
	}
	}
	System.out.println(s2);
}
}
