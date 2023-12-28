package Practice_Programs;

public class Program1 {
public static void main(String[] args) {
	int arr[]= {234, 654, 876, 789, 927, 713, 643};
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
		int n1=arr[i]/10;
		int n2=n1%10;
		int n3=arr[j]/10;
		int n4=n3%10;
		if(n2>n4)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
	}
	for(int k=0; k<arr.length; k++)
	{
	System.out.println(arr[k]);
	}
}
}
