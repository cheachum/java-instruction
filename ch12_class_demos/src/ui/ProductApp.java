package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Business.Product;
import util.Console;

public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		Product p1 = new Product("Java", "Murach's Java", 59.50);
		Product p2 = new Product("jsp", "Murach's Java Servlets and JSP", 55.50);
		Product p3 = new Product("mysql", "Murach's mysql", 54.50);
		Product p4 = new Product("c#", "Murach's c#", 58);
		Product p5 = new Product("andr", "Murach's Android", 61.50);
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		String code = Console.getString("Enter a code: ");
		
		// retrieve the product that matches the code entered
		Product pdt = null; 
		for (Product p : products) {
			if (p.getCode().equalsIgnoreCase(code)) {
				// that's my product 
				pdt = p;
			}
		}
		
		System.out.println("Your product is: "+pdt);
		
		System.out.println("Get product from map");
		Map<String, Product> productsMap = new HashMap<>();
		productsMap.put("Java", p1);
		productsMap.put("jsp", p2);
		productsMap.put("mysql", p3);
		productsMap.put("c#", p4);
		productsMap.put("andr", p5);
		
		System.out.println("Product selected: "+ productsMap.get(code));
		
		
		
		
		
		System.out.println("bye!");

	}

}
