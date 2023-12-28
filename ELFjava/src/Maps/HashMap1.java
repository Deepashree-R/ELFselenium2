package Maps;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
public static void main(String[] args) {
	HashMap<Integer, String> h=new HashMap();
	h.put(1, "Ravi");
	h.put(2, "Rahul");
	h.put(3, "Alok");
	h.put(7, "Akash");
	h.put(2, "Vivek");
	h.put(8, "Sourav");
	h.put(7, "vineet");
	
	
	Set<Integer> keysData=h.keySet();
	for(Integer data:keysData)
	{
		System.out.println(data);
	}
	
	
	Collection<String> valuesData=h.values();
	for(String data:valuesData)
	{
		System.out.println(data);
	}
	
	
	for(Entry<Integer,String> data:h.entrySet())
	{
		System.out.println(data.getKey()+" "+data.getValue());
	}
	h.remove(2);
	System.out.println(h);
}
}
