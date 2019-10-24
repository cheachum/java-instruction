import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) { 
		System.out.println("Welcome to the Letter Grade Converter");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            
            System.out.println("Enter numerical grade: ");
            int grade = sc.nextInt();
            char letter = 0;
            if(grade <= 100 || grade >= 88)
                letter = 'A';
                System.out.println("Your Grade is: " + letter);
            if (grade <= 87 || grade >= 80)
                letter = 'B';
                System.out.println("Your Grade is: " + letter);
            
            if (grade <= 79 || grade >= 67)
                letter = 'C';
                System.out.println("Your Grade is: " + letter);
            
            if(grade <= 66 || grade >= 60)
                letter = 'D';
                System.out.println("Your Grade is: " + letter);
            
            if(grade <= 60)
                letter = 'F';
                System.out.println("Your Grade is: " + letter);
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}