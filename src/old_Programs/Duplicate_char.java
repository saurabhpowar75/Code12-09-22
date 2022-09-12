package old_Programs;

public class Duplicate_char {

	public static void main(String[] args) 
	{
      String s="vvnnmmop";
      
      char sp[]=s.toCharArray();
      
      for (int i = 0; i < sp.length; i++) 
      {
		for (int j = i+1; j < sp.length; j++) 
		{
			if(sp[i]==sp[j])
			{
				System.out.println(sp[i]+" ");
			}
		}
	}
	}

}
