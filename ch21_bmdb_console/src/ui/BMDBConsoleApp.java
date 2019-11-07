package ui;

import java.time.LocalDate;
import java.util.List;
import business.Actor;
import business.Movie;
import db.ActorDB;
import db.MovieDB;
import util.Console;

public class BMDBConsoleApp {

	private static MovieDB movieDB = new MovieDB();
	private static ActorDB actorDB = new ActorDB();

	public static void main(String[] args) {
		System.out.println("bmbd console app");

		int choice = 0;

		while (choice != 99) {
			choice = Console.getInt(getMenu(), 0, 100);
			switch (choice) {
			case 1:
				// list movies
				List<Movie> movies = movieDB.list();
				System.out.println("List of Movies:");
				for (Movie m : movies) {
					System.out.println(m);
				}
				break;
			case 2:
				// list actors
				List<Actor> actors = actorDB.list();
				System.out.println("List of actors:");
				for (Actor a : actors) {
					System.out.println(a);
				}
				break;
			case 3:
				// add movies
				System.out.println("Add a movie: ");
				String t = Console.getString("Title?: ");
				int y = Console.getInt("Year?: ");
				String r = Console.getString("Rating?: ");
				String d = Console.getString("Director?: ");
				Movie m = new Movie(t, y, r, d);
				int rc = movieDB.add(m);
				if (rc == 1) {
					System.out.println("Movie added successfully");
				} else {
					System.out.println("Error adding movie..check logs");
				}
				break;
			case 4:
				// update movies
				m = getMovie();
				if (m != null) {
					int year = Console.getInt("New Year?: ");
					m.setYear(year);
					movieDB.update(m);
					rc = movieDB.update(m);
					if (rc == 1) {
						System.out.println("Movie updated successfully!");
					} else {
						System.out.println("Error updating movie year.");
					}
				} else {
					System.out.println("Error...movie id doesn't exist.");
				}
				break;
			case 5:
				// delete movies
				m = getMovie();
				if (m != null) {
					rc = movieDB.delete(m);
					if (rc == 1) {
						System.out.println("Movie deleted successfully!");
					} else {
						System.out.println("Error deleting movie year.");
					}
				} else {
					System.out.println("Error...movie id doesn't exist.");
				}

				break;
			case 6:
				// get movie
				m = getMovie();
				if (m != null) {
					System.out.println("Movie:");
					System.out.println(m);
				} else {
					System.out.println("Error.. movie doesn't exist.");
				}
				break;
			case 7:
				// get actor
				Actor a = getActor();
				if (a != null) {
					System.out.println("Actor:");
					System.out.println(a);
				} else {
					System.out.println("Error..actor doesn't exist");
				}
				break;
			case 8:
				// add actor
				System.out.println("Add actor: ");
				String fn = Console.getString("First Name?: ");
				String ln = Console.getString("Last Name?: ");
				String g = Console.getString("Gender?: ");
				String bds = Console.getString("Birthdate?: ");
				LocalDate bd = LocalDate.parse(bds);
				a = new Actor(fn, ln, g, bd);
				int rca = actorDB.add(a);
				if (rca == 1) {
					System.out.println("Actor added successfully");
				} else {
					System.out.println("Error adding actor..check logs");
				}
				break;
			case 9:
				// update actor
				a = getActor();
				if (a != null) {
					String firstName = Console.getString("First Name?: ");
					a.setString(firstName);
					actorDB.update(a);
					rc = actorDB.update(a);
					if (rc == 1) {
						System.out.println("Movie updated successfully!");
					} else {
						System.out.println("Error updating movie year.");
					}
				} else {
					System.out.println("Error...movie id doesn't exist.");
				}

				break;
			case 10:
				// delete actor
				break;
			case 99:
				// exit
				break;
			default:
				System.out.println("Invalid command.");
			}
		}

		System.out.println("Bye!");

	}

	private static String getMenu() {
		String menu = "Command:\n" + "1- List Movies\n" + "2 - List Actors\n" + "3 - Add Movie\n" + "4 - Edit Movie\n"
				+ "5 - Delete Movie\n" + "6 - Get Movie\n" + "7 - Get Actor\n" + "8 - Add Actors\n"
				+ "9 - Update Actor\n" + "10 - Delete Actor\n" + "99 - Exit\n";
		return menu;

	}

	private static Movie getMovie() {
		int id = Console.getInt("Id? ", 0, Integer.MAX_VALUE);
		Movie m = movieDB.get(id);
		return m;
	}

	private static Actor getActor() {
		int id = Console.getInt("Id? ", 0, Integer.MAX_VALUE);
		Actor a = actorDB.get(id);
		return a;
	}
}
