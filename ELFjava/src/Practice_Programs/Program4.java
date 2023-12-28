package Practice_Programs;

public class Program4 {
public static void main(String[] args) {
	int[] arr= {1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0};
	int minconsecutive=0;
	int count=1;
		for(int i=0; i<arr.length; i++)
	{
			minconsecutive=count;
	 count=1;
	 for(int j=i+1; j<arr.length; j++)
	 {
		 if(arr[i]==arr[j])
		 {
			 count++;
		 }
		 else
		 {
			 break;
		 }
	 }
	 if(minconsecutive<count)
	 {
		 minconsecutive=count;
	 }
	}
	System.out.println(minconsecutive);
}
}
