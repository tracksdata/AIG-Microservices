package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2" };
		
		
		PriceMatrix price=new PriceMatrixImpl(); // Dependency
		

		//-------------------------------------------
		BillingImpl biller = new BillingImpl(); // Dependent
		biller.setPrice(price); // DI (injecting Dependency to dependent)
		//-------------------------------------------

		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);
	}

}
