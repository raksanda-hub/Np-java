package com.nexttech.Java;

public class Lec5JavaException {

	public static void main(String[] args) {
		try {
		double[] price= {2.4,4.5,5.8,6.6,7.7,3.5,8.8,9.0} ;
		System.out.println(price[7]);
		}
		
		catch (Exception e) {
			System.out.println("something is wrong");
		}
		try {
			double[] price1= {2.4,4.5,5.8,6.6,7,4.4,8.9,6.6,4,3,1.1} ;
			System.out.println(price1[10]);
			}
		catch (Exception e) {
			System.out.println("something is Missing 1");
		}
		
		
		}

}
