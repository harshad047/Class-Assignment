package com.tss.test;

import java.util.Scanner;

import com.tss.model.IFurniture;
import com.tss.model.IFurnitureFactory;
import com.tss.model.ModernFurnitureFactory;
import com.tss.model.VictorianFurnitureFactory;


public class FurnitureTest {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Select a style (Modern/Victorian): ");
	        String style = scanner.nextLine().trim().toLowerCase();

	        IFurnitureFactory factory;
	        switch (style) {
	        case "modern":
	            factory = new ModernFurnitureFactory();
	            break;
	        case "victorian":
	            factory = new VictorianFurnitureFactory();
	            break;
	        default:
	            System.out.println("Unknown style selected.");
	            scanner.close();
	            return;
	    }


	        System.out.println("Select a product (Chair/Sofa/Table): ");
	        String product = scanner.nextLine().trim().toLowerCase();

	        IFurniture furniture;

	        switch (product) {
	            case "chair":
	                furniture = factory.createChair();
	                break;
	            case "sofa":
	                furniture = factory.createSofa();
	                break;
	            case "table":
	                furniture = factory.createTable();
	                break;
	            default:
	                System.out.println("Unknown product selected.");
	                scanner.close();
	                return;
	        }
	        furniture.describe();
	}

}
