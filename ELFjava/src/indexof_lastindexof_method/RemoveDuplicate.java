package indexof_lastindexof_method;

public class RemoveDuplicate {
public static void main(String[] args) {
	String s1="aabbccddeeff";
	String s2="";
	char arr[]=s1.toCharArray();
	for(int i=0; i<arr.length; i++)
	{
		if(s2.indexOf(arr[i])==-1)
{
	s2=s2+arr[i];
}
	}
	System.out.println(s2);
}
}
