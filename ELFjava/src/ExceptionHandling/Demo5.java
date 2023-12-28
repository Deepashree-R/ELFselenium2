package ExceptionHandling;

public class Demo5 {
	public static void main(String[] args) {
		try
		{
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[arr.length-1]);
		}
		catch(Exception e)
		{
			System.out.println("exception is handled");
		}
		finally
		{
			try
			{
				System.out.println(1/0);
			}
			catch(Exception e)
			{
			System.out.println("Exception is handled-1");	
			}
			finally
			{
				System.out.println("this is finally block");
			}
			
		}
	}
}
