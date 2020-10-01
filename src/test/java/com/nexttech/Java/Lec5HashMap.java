package com.nexttech.Java;

import java.util.HashMap;

public class Lec5HashMap {

	public static void main(String[] args) {
		//ArrayList
		//ArrayList<String>cars=new ArrayList();
		
		// Hash Map to store paired values
		
		
		HashMap<String,String>CapitalOfCountry=new HashMap<String,String>();
		CapitalOfCountry.put("USA","WashintonD.C");
		CapitalOfCountry.put("Bangladesh","Dhaka");
		CapitalOfCountry.put("India","Delhi");
		CapitalOfCountry.put("Pakistan","Lahor");
		CapitalOfCountry.put("UAE","Dubai");
		System.out.println(CapitalOfCountry);
		
		for(String i:CapitalOfCountry.keySet()) {
			System.out.println(i) ;
		}
		for(String m:CapitalOfCountry.values()) {
			System.out.println(m) ;
		}

		// To Access Value
		CapitalOfCountry.get("USA");
		System.out.println(CapitalOfCountry.get("USA"));
		//To remove
		CapitalOfCountry.remove("2");
		System.out.println(CapitalOfCountry.remove("India"));
		
		// store 3 paired value which contains numbers and alpha values
		HashMap<Integer,String>CustomerIdAndName=new HashMap<Integer,String>();
		CustomerIdAndName.put(1, "P");
		CustomerIdAndName.put(2, "J");
		CustomerIdAndName.put(3, "K");
		System.out.println(CustomerIdAndName);
		
		//Loop
		for(Integer k:CustomerIdAndName.keySet()) {
			System.out.println(k);
		}
		for(String j :CustomerIdAndName.values()) {
			System.out.println(j);


		}



	}

}
