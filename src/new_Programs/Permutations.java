package new_Programs;

public class Permutations {
	
	
	public static void permutation(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans+" ");
		}
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			
			String total=str.substring(0,i)+str.substring(i+1);
			
			permutation(total,ans+ch);
			
		}
	}

	public static void main(String[] args)
	{
  
		String s="abc";
		
		permutation(s,"");
      
       
	}

}
