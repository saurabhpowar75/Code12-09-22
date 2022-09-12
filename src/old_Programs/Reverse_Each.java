package old_Programs;

public class Reverse_Each {

	public static void main(String[] args) 
	{
       String s="Saurabh Is Working In HumanCloud";
       
       
      String sp[]=s.split(" ");
      
      String rev="";
      
      for (String w : sp) 
      {
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		rev=rev+sb.toString()+" ";
	}
      System.out.println(rev);
     

}
}