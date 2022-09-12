package new_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Second_Highest {

	public static void main(String[] args) 
	{
		
      List<Integer> a=Arrays.asList(10,20,40,80,100,25);	
		
      
     int sh=a.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
     
     System.out.println(sh);

	}

}
