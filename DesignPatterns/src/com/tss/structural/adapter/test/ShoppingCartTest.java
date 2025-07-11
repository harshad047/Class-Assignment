package com.tss.structural.adapter.test;

import com.tss.structural.adapter.model.Biscuit;
import com.tss.structural.adapter.model.Chocolate;
import com.tss.structural.adapter.model.Hat;
import com.tss.structural.adapter.model.HatAdapter;
import com.tss.structural.adapter.model.ShoppingCart;

import java.util.Scanner;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Biscuit");
            System.out.println("2. Add Chocolate");
            System.out.println("3. Add Hat");
            System.out.println("4. View Cart and Checkout");
            System.out.println("5. exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    cart.addItemsToCart(new Biscuit("Biscuit", 10));
                    System.out.println("Biscuit added to cart.");
                    break;
                case 2:
                    cart.addItemsToCart(new Chocolate("Chocolate", 20));
                    System.out.println("Chocolate added to cart.");
                    break;
                case 3:
                    cart.addItemsToCart(new HatAdapter(new Hat("Hat", "Long", 50, 7)));
                    System.out.println("Hat added to cart.");
                    break;
                case 4:
                    System.out.println("\n--- Final Cart ---");
                    cart.displayCart();
                    loop = false;
                    break;
                case 5:
                	System.out.println("Thank You For Visiting !");
                	loop = false;
                	break;
      
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
