package old_Programs;

public class Duplicate_Word {

	public static void main(String[] args) 
	{
	      String s="shaka laka laka boom boom boom";
	      String sp[]=s.split(" ");
	      int count=1;
	      
	      for (int i = 0; i < sp.length; i++) 
	      {
			for (int j = i+1; j < sp.length; j++)
			{
				if(sp[i].equals(sp[j]))
				{
					count++;
					sp[j]="0";
				}
			}
			if((count>1) && (sp[i]!="0"))
			{
				System.out.println(sp[i]+" "+count);
			}
		}

	}

}
