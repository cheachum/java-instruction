package ui;

import java.util.Arrays;

import business.Product;

public class ArraysDemoApp {

	public static void main(String[] args) {
		double[] prices = new double[4];
		prices[0] = 4.99;
		prices[1] = 7.99;
		prices[2] = 25.99;
		prices[3] = 1.99;

		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		String[] names = { "Sean", "johnny", "Matt", "Chea", "John", "Erin" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		int[] nbrs = new int[10];
		for (int i = 0; i < 10; i++) {
			nbrs[i] = i * 10;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(nbrs[i]);
		}

		Product p1 = new Product("Java", "Murach's Java Programming", 59.50);
		Product p2 = new Product("Java", "Murach's Android Programming", 59.50);

		Product[] pdts = { p1, p2 };

		for (int i = 0; i < pdts.length; i++) {
			System.out.println(pdts[i]);
		}
		// computting average
		double sum = 0;
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		System.out.println("sum= " + sum);
		System.out.println("avg= " + sum / prices.length);

		// for each loop used when you don't need to know the index position
		for (int n : nbrs) {
			System.out.println(n);
		}

		// binary search on nbrs
		int idx = Arrays.binarySearch(nbrs, 40);
		System.out.println("Position of 40 in nbrs= " + idx);

		// sort the array of prices
		Arrays.sort(prices);
		for (double d : prices) {
			System.out.println(d);

			// sort the array of names by string
			Arrays.sort(names);
			for (String s : names) {
				System.out.println(s);
			}
		}

		Arrays.sort(pdts);
		for (Product p : pdts) {
			System.out.println(p);
		}

		String[][] ticTacToeGrid = new String[3][3];
		for (int r = 0; r < ticTacToeGrid.length; r++) {
			for (int c = 0; c < ticTacToeGrid[r].length; c++) {
				ticTacToeGrid[r][c] = r + "-" + c;
			}
		}
		String table = "";
		// display 3x3 array
		for (int r = 0; r < ticTacToeGrid.length; r++) {
			// process row
			String row = "";
			for (int c = 0; c < ticTacToeGrid[r].length; c++) {
				// System.out.println("ticTacToeGrid[r][c] = " +r+"-"+c);
				// process column
				row += ticTacToeGrid[r][c] + " ";

			}
			row += "\n";
			table += row;
		}
		System.out.println(table);

	}

}
