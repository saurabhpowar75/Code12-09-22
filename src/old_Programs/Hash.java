package old_Programs;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) 
	{
String s="Shaka Laka Boom Boom Boom";
        
        String []sp=s.split(" ");
        
        HashMap <String,Integer> h=new HashMap <String,Integer>();
        
        for(String w:sp)
        {
            if(h.containsKey(w))
            {
                h.put((w),h.get(w)+1);
            }
            else
            {
              h.put((w),1);
 
            }
        }
        System.out.print(h+" ");
	}

}
