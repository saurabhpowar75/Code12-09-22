package new_Programs;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) 
	{
 Scanner sc=new Scanner(System.in);
 
 String st="Red";
 
 String guess="";
 
 while(!guess.equals(st))
 {
	 System.out.println("Enter Color");
	 guess=sc.nextLine();
 }
 System.out.println("You Win!");

 
 
	}

}
