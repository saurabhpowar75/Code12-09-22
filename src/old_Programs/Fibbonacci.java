package old_Programs;

public class Fibbonacci {

	public static void main(String[] args) 
	{
           //0 1 1 2 3 5
		
		
		int Fn=1;
		int Sn=0;
		int add;
		
	 for (int i = 0; i <= 10; i++) 
	 {
		 if(Sn>2)
		 {
				System.out.print(Sn+" ");
 
		 }
		add=Fn+Sn;
		Sn=Fn;
		Fn=add;
	}
	 

	}

}
