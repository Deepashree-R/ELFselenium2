package Practice_programs3;

public class merge_array {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4};
	int arr2[]= {5,6,7,8};
	int result[]=new int[arr1.length+arr2.length];
	int k=0;
	for(int i=0; i<arr1.length; i++)
	{
		result[k]=arr1[i];
		k++;
    }
	if(k>arr1.length-1)
	{
		for(int j=arr2.length-1; j>=0; j--)
		{
			result[k]=arr2[j];
			k++;
		}
	}
	for(k=0; k<result.length; k++)
	{
		System.out.print(result[k]+" ");
	}
}
}
