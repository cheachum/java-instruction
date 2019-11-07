package ui;

import java.util.Scanner;

public class ArrowheadApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the arrow head app!");
		Scanner sc = new Scanner (System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("How many arrowheads to add?: ");
		int arrowhead  = (sc.nextInt()); 
		if  (sc.
		
		
		
		
		
		
		
		
		
		
		
		
		choice = getString(sc, "Add more? y/n: ");
	
		}
		sc.close(); 
		System.out.println("Bye!");
		}
		

	

	private static String getString(Scanner sc, String string) {
		String s = "";
		boolean isValid = false;
		// keep prompting until user enters y or n
		while (!isValid) {
			System.out.println(prompt);
			s = sc.nextLine();
			// check for empty string
			if (s.equalsIgnoreCase("")) {
				System.out.println("Error... entry is required");
				continue;
			}
			else if (s.equalsIgnoreCase("y")||s.equalsIgnoreCase("n")) {
				isValid = true;
			}
			else {
				System.out.println("Error... only 'y' or 'n' is accepted.");
				continue;				
			}
		}
		
		return s;
	}


}
