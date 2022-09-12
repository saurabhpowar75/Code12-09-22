package old_Programs;

public class Palidrome_String {

	public static void main(String[] args) 
	
	{
       String s="racecar";
       
       String rev="";
       
       String a=s;
       
      for(int i=s.length()-1;i>=0;i--)
      {
    	 rev=rev+s.charAt(i); 
      }
      System.out.println(rev);
      
      if(a.equals(rev))
      {
    	  System.out.println("Palidrome");
      }
      else
      {
    	  System.out.println("Not");
      }
	}

}
