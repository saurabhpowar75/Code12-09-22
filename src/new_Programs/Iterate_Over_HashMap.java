package new_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Iterate_Over_HashMap {

	public static void main(String[] args) 
	{
       HashMap <Integer, String> h=new HashMap <Integer, String>();
       
       h.put(1, "Naruto");
       h.put(2, "Hinata");
       h.put(3, "Kakashi");
       h.put(4, "Rock Lee");
       h.put(5, "Sakura");
       
       
//       Iterator<Entry<Integer, String>>  iterator=h.entrySet().iterator(); //instead of entryset we can use keySet
//       
//       while(iterator.hasNext())
//       {
//    	   Entry<Integer, String> all=iterator.next();
//    	   System.out.println(all.getKey());
//    	   System.out.println(all.getValue());
//
//       }
       

		
		h.forEach((key,value)-> 
		{
			System.out.println(key);
			System.out.println(value);
		});
		
	




	}

}
