package Practice_Programs2;

public class Program3 {
public static void main(String[] args) {
	String value="AAAAbbccDDDDDeeeeFFFFgggg";
	String s="";
	char arr[]=value.toCharArray();
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>='A' && arr[i]<='Z')
		{
		s=(char) arr[i]+32;
		}
	}
	
//	value=value.substring(0, 4).toLowerCase()+value.substring(4, 6).toUpperCase();
//	System.out.println(value);
}
}
