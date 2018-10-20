package test;

import static org.junit.jupiter.api.Assertions.*;

import display.*;
import orderingSystem.*;
import itemBuilder.*;
import fryer.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {	
				
				// Factory Pattern Test.
		
				Register_1 reg1 = new Register_1();
				Register_2 reg2 = new Register_2();
				
				reg1.createMenuItem("hamburger");
				reg1.createMenuItem("Deluxe Burger");
				reg1.createMenuItem("Double Burger");
				reg1.createMenuItem("Fries");
				
				assertEquals(2.99, reg1.getPrice(0), 0.001);
				assertEquals(5.99, reg1.getPrice(1), 0.001);
				assertEquals(3.99, reg1.getPrice(2), 0.001);
				assertEquals(1.99, reg1.getPrice(3), 0.001);
				
				reg2.createMenuItem("hamburger");
				reg2.createMenuItem("Deluxe Burger");
				reg2.createMenuItem("Double Burger");
				reg2.createMenuItem("Fries");
				
				assertEquals(2.99, reg1.getPrice(0), 0.001);
				assertEquals(5.99, reg1.getPrice(1), 0.001);
				assertEquals(3.99, reg1.getPrice(2), 0.001);
				assertEquals(1.99, reg1.getPrice(3), 0.001);
				
				// Decorator Pattern Test.
				
				MenuItem cheese = new Cheese(reg1.getMenuItem(0));
				assertEquals(3.49, cheese.getPrice(), 0.001);
				
				MenuItem mayonnaise = new Mayonnaise(cheese);
				assertEquals(3.54, mayonnaise.getPrice(), 0.001);
				
				MenuItem onions = new Onions(mayonnaise);
				assertEquals(3.59, onions.getPrice(), 0.001);
				
				MenuItem pickles = new Pickles(onions);
				assertEquals(3.64, pickles.getPrice(), 0.001);
				
				MenuItem tomato = new Tomato(pickles);
				assertEquals(3.89, tomato.getPrice(), 0.001);
				
				// Observer Pattern Test.
				
				FryerDisplay fryer = new FryerDisplay();
				KitchenDisplay kitchen = new KitchenDisplay();
				RegisterDisplay register = new RegisterDisplay();
				
				reg1.registerObserver(fryer);
				reg1.registerObserver(kitchen);
				reg1.registerObserver(register);
				
				reg1.notifyObservers();
				
				assertEquals(fryer.getMenuItem(0).getPrice(), reg1.getMenuItem(0).getPrice(), 0.001);
				assertEquals(kitchen.getMenuItem(0).getPrice(), reg1.getMenuItem(0).getPrice(), 0.001);
				assertEquals(register.getMenuItem(0).getPrice(), reg1.getMenuItem(0).getPrice(), 0.001);
	}
}
