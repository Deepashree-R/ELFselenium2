package splitmethod;

public class ReverseString {
public static void main(String[] args) {
	String s="I live in Bangalore";
	String arr[]=s.split(" ");
	String rev=" ";
	for(int i=arr.length-1; i>=0; i--)
	{
		rev=rev+arr[i]+" ";
	}
	System.out.println(rev);
}
}
