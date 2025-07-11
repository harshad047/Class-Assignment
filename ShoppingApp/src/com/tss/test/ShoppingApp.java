package com.tss.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.tss.model.Customer;
import com.tss.model.LineItem;
import com.tss.model.Order;
import com.tss.model.Product;

public class ShoppingApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		System.out.println("Welcome to the Shopping Application!");
		while (true) {
			System.out.println("\n1. Add Product\n2. View Products\n3. Create Order\n4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addProduct(products);
				break;
			case 2:
				viewProducts(products);
				break;
			case 3:
				if (products.isEmpty()) {
					System.out.println("Add products first.");
				} else {
					createOrder(products);
				}
				break;
			case 4:
				System.out.println("Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private static void addProduct(List<Product> products) {
		System.out.print("Product ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Price: ");
		double price = scanner.nextDouble();
		System.out.print("Discount %: ");
		double discount = scanner.nextDouble();
		scanner.nextLine();
		products.add(new Product(id, name, price, discount));
		System.out.println("Product added.");
	}

	private static void viewProducts(List<Product> products) {
		if (products.isEmpty()) {
			System.out.println("No products.");
		} else {
			for (Product p : products)
				System.out.println(p);
		}
	}

	private static void createOrder(List<Product> products) {
		System.out.print("Customer ID: ");
		int custId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Customer Name: ");
		String custName = scanner.nextLine();
		System.out.print("Order ID: ");
		int orderId = scanner.nextInt();
		scanner.nextLine();
		Customer customer = new Customer(custId, custName);
		Order order = new Order(orderId);
		while (true) {
			for (Product p : products)
				System.out.println(p);
			System.out.print("Product ID: ");
			int pid = scanner.nextInt();
			scanner.nextLine();
			Product sel = null;
			for (Product p : products)
				if (p.getId() == pid)
					sel = p;
			if (sel == null) {
				System.out.println("Invalid ID.");
				continue;
			}
			System.out.print("Qty: ");
			int qty = scanner.nextInt();
			scanner.nextLine();
			order.addItem(new LineItem(order.getItems().size() + 1, qty, sel));
			System.out.print("Add more? (y/n): ");
			if (scanner.nextLine().equalsIgnoreCase("n"))
				break;
		}
		customer.addOrder(order);
		printBill(customer, order);
	}

	private static void printBill(Customer customer, Order order) {
		System.out.println("\n*** BILL ***");
		System.out.println("Customer: " + customer.getId() + " " + customer.getName());
		System.out.println("Order ID: " + order.getId() + ", Date: " + order.getDate());
		System.out.printf("%-5s %-10s %-10s %-5s %-10s %-10s %-12s %-10s\n", "Line", "ProdID", "Name", "Qty", "Price",
				"Disc%", "DiscPrice", "Cost");
		int line = 1;
		for (LineItem item : order.getItems()) {
			Product p = item.getProduct();
			System.out.printf("%-5d %-10d %-10s %-5d %-10.0f %-10.0f %-12.0f %-10.0f\n", line++, p.getId(), p.getName(),
					item.getQuantity(), p.getPrice(), p.getDiscountPercent(), p.calculateDiscountedPrice(),
					item.calculateLineItemCost());
		}
		System.out.println("Total: " + order.calculateOrderPrice());
		System.out.println("*** Thank You! ***");
	}
}
