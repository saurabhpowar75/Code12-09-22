package new_Programs;

import java.util.HashMap;

public class Practice 
{
	
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(1, "Saurabh");
		h.put(2, "Naruto");
		h.put(3, "Kakashi");
		h.put(4, "Sasuke");
		h.put(5, "Rock Lee");
		
		
		h.forEach((key,value)->
		{
		System.out.println(key);
		System.out.println(value);
		});

	}
}


