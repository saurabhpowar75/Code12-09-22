package old_Programs;

public class Remove_Spaces_String {

	public static void main(String[] args)
	{
      String s="Java Is Simple Programming Language";
      
     char t[]=s.toCharArray();
     
     String rev="";
     
     for (int i = 0; i < t.length; i++) 
     {
		if(t[i]!=' ')
		{
			rev=rev+s.charAt(i);
		}
	}
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
