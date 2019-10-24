package ui;

import java.util.ArrayList;
import java.util.List;
import business.User;
import util.Console;

public class PrsConsoleApp {
			
			public static void main(String[] args) {
				
				User u1 = new User(1, "milliepuppin", "tatertot", "millie", "oestreicher", "612-555-6666" ,"milliepuppin@gmail", true, false);
				User u2 = new User(2, "osizzle", "pillow", "david", "oestreicher", "513-666-9999","davidoestreicher@gmail", true, true);
				User u3 = new User(3,"cheachum", "apple", "chea", "chum", "507-380-4254", "cheachum@gmail", true, false);
				
				List<User> users = new ArrayList<>();
				users.add(u1);
				users.add(u2);
				users.add(u3);
				
				System.out.println("Welcome to the PRS-Console App");
				
				String command = Console.getString("Enter User Name: ");
				User u = null;
				for (User un : users) {
					if (un.getUserName().equalsIgnoreCase(command)) {
						un = u;
					}
				
				while (!command.equalsIgnoreCase("exit")) {
					command = Console.getString(getDisplayMenu());
					 if (command.equalsIgnoreCase("list"));
					switch (command.toLowerCase()) {
					case "list": 
						//list items
						//each item on it's own line
						//prefix with index # +1
						for ( int i=0; i< users.size(); i++) {
							System.out.println((i+1+". "+users.get(i)));
						}
						break;
					case "add": 
						// add an item
						User u4 = new User();
						command = Console.getString("enter username: ");
						u4.setUserName(command);
						users.add(u4); 
						System.out.println("New User Added: " + u4.getUserName());
						break;
					case "get": 
						int providedId = Console.getInt("Get user ID: ");
						for ( User us : users  ) {
							if (us.getId() == providedId) {
								System.out.println(us);
							}
						}
						break;
					case "edit": 
						//edit an item
						 providedId = Console.getInt("Get user ID: ");
						User u5 = null;
						 for ( User us : users  ) {
							if (us.getId() == providedId) {
								u5 = us;
							} 
						} 
						 u5.setUserName(Console.getString("New UserName: "));
						 System.out.println("Updated username: "+u5.getUserName());
						 
						break; 
					case "delete":
						//delete an item
						 providedId = Console.getInt("Delete user ID: ");
							User u6 = null;
							 for ( User us : users  ) {
								if (us.getId() == providedId) {
									u6 = us;
								}
							 }
							 users.remove(u6);
							 System.out.println("Deleted user: "+ u6);
							 {
							}
							
						break;
					case "exit": 
						//exit game
						break;
						default: 
							System.out.println("Invalid command. Try again.");
					}
					
				}
				
				
				System.out.println("bye!");
				}
				

			}
			private static String getUser(String string) {
				return null;
			}
			private static int command(List<User> users) {
				return 0;
			}
			
				

			
			private static String getDisplayMenu() {
				String menu = "\nCOMMAND MENU\n" + "List - List all users \n" + "get - Get a user\n" + "edit - Edit a user\n" + "delete - delete user\n" + "exit - Exit App\n" + 
						" \r\n" + 
						"Command:";
				
				return menu; 
			}

			{ 
				
			}


	}

