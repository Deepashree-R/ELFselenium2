package Extra_Program;

public class Unitplace_sortinAscendingorder {
	public static void main(String[] args) {
		int arr[]= {12,98,45,23,74,56,87};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				int num1=arr[i]%10;
				int num2=arr[j]%10;
				if(num1>num2)
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
