package toCharArraymethod;

public class Reversename {
public static void main(String[] args) {
	String s="Deepashree";
	//String rev="";
	char arr[]=s.toCharArray();
	for(int i=arr.length-1; i>=0; i--)
	{
	System.out.print(arr[i]);
	}
	/*for(int i=arr.length-1; i>=0; i--)
	{
		rev=rev+arr[i];
	}
	System.out.println(rev);*/

}
}
