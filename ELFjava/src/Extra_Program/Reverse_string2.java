package Extra_Program;

public class Reverse_string2 {
public static void main(String[] args) {
	String s1="i live in bangalore";
	String arr[]=s1.split(" ");
	String rev="";
	for(int i=arr.length-1; i>=0; i--)
	{
		rev=rev+arr[i]+" ";
			
	}
	System.out.println(rev);
	
	
	
	
//	String reverse=" ";
//	for(int i=arr.length-1; i>=0; i--)
//	{
//		rev="";
//		for(int j=arr[i].length()-1; j>=0; j--)
//		{
//			rev=rev+arr[i].charAt(j);
//				
//		}
//		reverse=reverse+rev+" ";
//	}
//	
//	System.out.println(reverse);
}
}
