package com.nexttech.Java;

public class Lec7inheritencesubclass extends Lec7inheritancesuperclass{
	public void LoginIN(String Email,String PW) {}
	public static void main(String[] args) {
		Lec7inheritencesubclass inherittence=new Lec7inheritencesubclass ();
		
        inherittence.method1(5,6);
        inherittence.Flower();
        inherittence.LoginIN("by@gmail.com", "333TN");
	}

}
