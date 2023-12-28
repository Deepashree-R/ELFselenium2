package programs;

public class Convert {
public static void main(String[] args) {
	String s1="i live in bangalore";
	String arr[]=s1.split(" ");
	String s2="";
	for(int i=0; i<arr.length; i++)
	{
	s2=s2+arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1)+" ";	
	}
	s2=s2.trim();
	System.out.println(s2);
}
}
