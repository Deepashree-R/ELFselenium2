package Maps;


import java.util.HashMap;
import java.util.Map.Entry;


public class Occurance2 {
public static void main(String[] args) {
	String s1="Hello Hye Hello How Hello Are You";
	String arr[]=s1.split(" ");
	HashMap<String, Integer> h=new HashMap<>();
	int count=0;
	for(int i=0; i<arr.length; i++)
	{
		count=0;
		for(int j=0; j<arr.length; j++)
		{
			if(arr[i].equals(arr[j]))
			{
				count++;
			}
		}
			h.put(arr[i], count);
		}
		System.out.println(h);
		for(Entry<String, Integer> data:h.entrySet()) {
			if(data.getValue()>1)
			{
				System.out.println(data.getKey());
			}
		}
	}
	
}
