package com.tnsif.assignmentTwo;
import java.util.Scanner;
public class Details {
		public static void main(String[] args)
	       {
			  Scanner s = new Scanner(System.in);
		      System.out.println("enter your name");
		      String Name=s.nextLine();
		      System.out.println("enter your Initial");
		      String Initial=s.nextLine();
		      System.out.println("enter your Roll number");
		      long RollNumber=s.nextLong();
		      System.out.println("enter your Grade");
		      char Grade=s.next().charAt(0);
		      System.out.println("enter your Percentage");
		      float Percentage=s.nextFloat();
		      System.out.println("Name:"+Name+" "+Initial);
		      System.out.println("Roll Number:"+RollNumber);
		      System.out.println("Grade:"+Grade);
		      System.out.println("Percentage:"+Percentage);
			}
	}
