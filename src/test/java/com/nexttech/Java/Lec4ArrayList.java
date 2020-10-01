package com.nexttech.Java;

import java.util.ArrayList;

public class Lec4ArrayList {

	public static void main(String[] args) {
		// ArrayList is a class,String is a Data type,Cars is variable= new ArrayList ();
		
		
		ArrayList<Integer>Numbers=new ArrayList () ;
		ArrayList<Double>Decimal=new ArrayList () ;
		
		
    ArrayList<String>Cars=new ArrayList ();	
    
	Cars.add("BMW") ;
	Cars.add("Nissan GTR") ;
	Cars.add("Toyota");
	Cars.add("Mustang");
	Cars.add("Audi");
	System.out.println(Cars);
	
	ArrayList<String>Menu=new ArrayList ();	
	//adding value
	Menu.add("Lamb Chop");
	Menu.add("Rock Shrimp");
	Menu.add("Royal Dorado");
	System.out.println(Menu);
	ArrayList<String>Vegetables=new ArrayList ();
	Vegetables.add("Coli Flower");
	Vegetables.add("Okra");
	Vegetables.add("Tomato");
	Vegetables.add("Carrot");
	System.out.println(Vegetables);
	System.out.println(Vegetables.get(3));
	System.out.println(Vegetables.set(0, "Tomato"));
	System.out.println(Vegetables.remove(2));
	System.out.println(Vegetables.size());
	//access value or check  the value
	Menu.get(1);
	//change/replace value
	Menu.set(0, "Shrimp");
	//delete
	Menu.remove(1);
	//clear (delete all)
	Menu.clear();
	// size or length in Array
	Menu.size();

 
	}

}
