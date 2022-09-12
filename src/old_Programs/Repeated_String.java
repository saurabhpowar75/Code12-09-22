package old_Programs;

import java.util.HashMap;

public class Repeated_String {

	public static void main(String[] args) 
	{
      String s="Zoobi Doobi Zoobi Doobi";
      
      String sp[]=s.split(" ");
      
      HashMap<String,Integer> h=new HashMap<String,Integer>();
      
      for(String c:sp)
      {
    	  if(h.containsKey(c))
    		  
    	  {
    		  h.put(c, h.get(c)+1);
    	  }
    	  else
    	  {
    		  h.put(c, 1);
    	  }
      }
      System.out.println(h+" ");
      
      
	}

}
