package old_Programs;

public class Leap_Year {

	public static void main(String[] args) 
	{
		
		int y=2017;
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not");
		}

	}

}
