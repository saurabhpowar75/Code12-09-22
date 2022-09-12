package old_Programs;

public class Ternary_Op {

	public static void main(String[] args) 
	{
        int a=45;
        int b=47;
        int d=42;
        
     int c=(a>b)?(a>d?a:d):(b>d?b:d);
     
      System.out.println(c);
	}

}
