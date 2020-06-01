package com.pricematrix;

import org.springframework.stereotype.Repository;

//Dependency
@Repository
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl obj created..");
	}

	@Override
	public double getItemPrice(String itemCode) {

		// code to fetch item-price from database

		return 100.00;

	}

}
