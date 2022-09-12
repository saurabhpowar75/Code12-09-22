package new_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Iterate_Over {

	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(1, "Naruto");
		h.put(2, "Kakashi");
		h.put(3, "Sakura");
		h.put(4, "Madara");
		h.put(5, "Itachi");
		
//       h.forEach((key,value)->
//       {
//    	   System.out.println(key);
//    	   System.out.println(value);
//       });

		Iterator<Entry<Integer, String>> 	iterate=h.entrySet().iterator();
		
		while(iterate.hasNext())
		{
			Entry<Integer, String> p= iterate.next();
			System.out.println(p.getKey());
			System.out.println(p.getValue());
		}
		
	}

}
