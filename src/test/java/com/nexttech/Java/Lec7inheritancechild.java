package com.nexttech.Java;

public class Lec7inheritancechild extends Lec7inheritance{
	public void LoginFB(String Email,double PW) { 
		
	}
	//method over riding just copy and paste.

	public static void main(String[] args) {
		
		Lec7inheritancechild inherit=new Lec7inheritancechild();
				inherit.method();
				inherit.Fruit();
				inherit.LoginFB("fy@gmail.com", "1234N");
				inherit.sum(12, 4, 16);
				//both method overloading and overidding are the concept of polymorphism
				// method over loading: same method name but different perameters.
				// method over riding: same method/duplicated method.
				//method over loading
				
			
	}

}
