package old_Programs;

public class Reverse_Sentence {

	public static void main(String[] args) 
	{
      String s="Saurabh Is Working In Humancloud";
      
      String sp[]=s.split(" ");
      
      for(int i=sp.length-1;i>=  0;i--)
      {
    	  System.out.print(sp[i]);
      }
	}

}
