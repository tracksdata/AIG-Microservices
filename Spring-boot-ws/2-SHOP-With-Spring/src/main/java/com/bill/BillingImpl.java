package com.bill;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

//Dependent
@Service
@Configurable(autowire = Autowire.BY_NAME)
public class BillingImpl {
	
	/*
	 * OO principle
	 * 
	 * "closed for modification, open for extension"
	 * 
	 * Design & performance issues
	 * -------------------------------
	 *  a. tight-coupling (maintenance issues)
	 *  
	 *  b. too many dependencies created/destructed (memory  use high / slow)
	 * 
	 *  c. Unit-Testing not possible (can't ensure component functions, dev slow)
	 * 
	 * 
	 *  why these issues occurring here?
	 *  ------------------------------------
	 *  
	 *  -> dependent class itself creating dependency class object. 
	 *  
	 *  what is the solution?
	 *  ----------------------
	 *  -> do not create dependency in dependent's class.
	 *  -> instead use look up technique (JNDI)
	 *  	issue: dependent class is tightly couple with JNDI location
	 *  -> location tight-coupling
	 * 
	 *   What is the best solution?
	 *   ----------------------------
	 *   
	 *   -> don't create & don't look up, instead get/injected by 'some-one' (IoC)- Inversion of control
	 * 
	 * 
	 *      How Can you implement IoC?
	 *      ----------------------------
	 *      way-1 : 'dependency injection' (DI)
	 *      way-2 : 'AOP' (via  proxy )
	 *      
	 *      What is Dependency Injection?
	 *      -> Injecting Dependency object to the dependent object
	 *      
	 *      how many ways dependency injection' (DI) can be implemented?
	 *      ---------------------------------------------------------------
	 *      way-1: setter based DI
	 *      way-2: constructed based DI
	 */
	
	
	
    private PriceMatrix price;
	
  
	public BillingImpl(PriceMatrixImpl price) {
		// TODO Auto-generated constructor stub
		this.price=price;
	}
	
	public double getCartTotal(String[] cart) {

		//PriceMatrix price = new PriceMatrixImpl();

		double total = 0.0;

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
