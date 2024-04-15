package com.tnsif.assignmentTwo;
import java.util.Scanner;
public class Circle {
	 private double radius;
	 private String color; 
	    public void getInput() {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter the radius of the circle:");
	    	radius=scanner.nextDouble();
	    	System.out.println("Enter the color of the circle:");
	    	color= scanner.next();	
	    }
	    public void calcArea() {
	    	double area=Math.PI*radius*radius;
	    	System.out.println("The area of the circular is:"+area);	
	    }
		public static void main(String[] args) {
			Circle circle1=new Circle();
			circle1.getInput();
			circle1.calcArea();
			

		}

	}


