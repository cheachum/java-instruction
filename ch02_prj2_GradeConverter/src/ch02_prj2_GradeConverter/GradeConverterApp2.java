package ch02_prj2_GradeConverter;

import java.util.Scanner;

public class GradeConverterApp2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Numerical Grade: ");
			int numGrade = sc.nextInt();
			String letterGrade = "";
			
			//use grade criteria to convert numGrade 
			//to letterGrade
			if(numGrade >= 88) 
				letterGrade = "A";
			else if (numGrade >= 80)
				letterGrade = "B";
			else if(numGrade >= 67) 
				letterGrade = "C";
			else if (numGrade >= 60)
				letterGrade = "D";
			else 
				letterGrade = "F";
			
			System.out.println("Letter Grade: "+letterGrade);
			
			System.out.println("Continue?  ");
			choice = sc.next();
			
			
		}
		
		
		
		
		
		
		
		
		
		System.out.println("bye!");

	}

}
