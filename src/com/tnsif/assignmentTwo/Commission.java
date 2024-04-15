package com.tnsif.assignmentTwo;
import java.util.Scanner;
public class Commission {
		String Name,Address;
		long PhoneNo,Sales_Amount;
		
	    public void details() {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the employee name:");
	    	Name=sc.nextLine();
	    	System.out.println("Enter the employee Address:");
	    	Address=sc.nextLine();
	    	System.out.println("Enter the employee Phone Number:");
	    	PhoneNo=sc.nextLong();
	    	System.out.println("Enter the employee Sales_Amount:");
	    	Sales_Amount=sc.nextLong();  	 	
	    }
		
	    public void calculateCommission() {
	    	if(Sales_Amount>=100000)
	    	   System.out.println("commission=10%");
	    	else if(50000>=Sales_Amount && Sales_Amount<100000)
	    	   System.out.println("commission=5%");
	    	else if(30000>=Sales_Amount && Sales_Amount<50000)
	 	       System.out.println("commission=3%");   
	 	    else 
	 	    	System.out.println("no commission");
	    	
	    }
		public static void main(String[] args) {
			Commission commission=new Commission();
			commission.details();
			commission.calculateCommission();

		}

	}
