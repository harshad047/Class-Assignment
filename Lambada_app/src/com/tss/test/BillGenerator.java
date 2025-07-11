package com.tss.test;

import java.util.function.Function;
import java.util.function.Supplier;

import com.tss.model.Item;

public class BillGenerator {

	public static void main(String[] args) {

		Supplier<Double> shippingChargeSupplier = () -> 70.0;

		Function<Item, String> generateBill = (item) -> {

			double basePrice = item.getPrice();
			double tax = basePrice * 0.18;
			double shipping = shippingChargeSupplier.get();
			double finalAmount = basePrice + tax + shipping;

			return "------ Bill Details ------\n" + "Item Name\t: " + item.getName() + "\n" + "Base Price\t: ₹"
					+ basePrice + "\n" + "Tax (18%)\t: ₹" + tax + "\n" + "Shipping\t: ₹" + shipping + "\n"
					+ "--------------------------\n" + "Final Amount\t: ₹" + finalAmount + "\n"
					+ "--------------------------";

		};

		Item item = new Item("Laptop", 50000);
		String bill = generateBill.apply(item);
		System.out.println(bill);
	}

}
