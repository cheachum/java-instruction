package ui;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {
	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App!");
		
		int command = 0; 
		while (command !=6) {
			command = Console.getInt(getMenu(), 0, 7);
			switch (command) {
			case 1: 
				//list
				break;
			case 2:
				//get
				int id = Console.getInt("ID:  ");
				getStuffy(id);
				break;
			case 3:
				//add- prompt user for stuffy values
				String type = Console.getString("type:  ");
				String color = Console.getString("color:  ");
				String size = Console.getString("size:  ");
				int limbs = Console.getInt("limbs:  ");
				Stuffy s = new Stuffy(type, color, size, limbs);
				int rowCount = sdb.add(s);
				System.out.println(rowCount+" rows affected.");
				break;
			case 4: 
				//edit
				String type1 = Console.getString("type:  ");
				String color1 = Console.getString("color:  ");
				String size1 = Console.getString("size:  ");
				int limbs1 = Console.getInt("limbs:  ");
				s = new Stuffy(type1, color1, size1, limbs1);
				int modify = sdb.add(s);
				System.out.println("Edited Stuffy:  "+modify);
				break;
			case 5:
				//delete
				break;
			case 6: 
				//exit
				break; 
			default: 
					//error
					System.out.println("Invalid command!");
			}
				
				
			}
		System.out.println("bye!");
			
			
			
		}
		
	private static String getMenu() {
		String menu = "Command:\n" +
					  "1- List\n" +
					  "2 - Get\n" +
					  "3 - Add\n" +
					  "4- Edit\n" +
					  "5- Delete\n" +
					  "6- Exit";
					  return menu; 
	}
	
	private static Stuffy getStuffy(int id) {
		Stuffy s = sdb.get(id);
		if (s!=null) {
			System.out.println("Stuffy:  ");
			System.out.println(s);
		}
		else {
			System.out.println("No stuffy exists for id:  "+id);
		}
		return s;
	}

}
