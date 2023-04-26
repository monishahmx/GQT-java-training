package com.gqt.oopsprojs.package2;
//program to write all the functionality in a oops concept

import java.util.Scanner;

abstract class Car{
	abstract void colour();
	abstract void price();
	void speed() {
		System.out.println("Car accelerates at good speed");
	}
	
}
 class Innova extends Car{
	 String colour;
	double price;
	@Override
	void colour() {
		System.out.println("Innova");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the colour:");
		colour =sc.next();
	}
	@Override
	void price() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price:");
		price =sc.nextDouble();
	}
		
	}
 class Kia extends Car{
	 String colour;
	double price;
	@Override
	void colour() {
		System.out.println("Kia");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the colour:");
		colour =sc.next();
	}
	@Override
	void price() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price:");
		price =sc.nextDouble();
	}
		
	}
 class Mercedes extends Car{
	 String colour;
	double price;
	@Override
	void colour() {
		System.out.println("Mercedes");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the colour:");
		colour =sc.next();
	}
	@Override
	void price() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price:");
		price =sc.nextDouble();
	}
		
	}
 class Maruthi extends Car{
	 String colour;
	double price;
	@Override
	void colour() {
		System.out.println("Maruthi");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the colour:");
		colour =sc.next();
	}
	@Override
	void price() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price:");
		price =sc.nextDouble();
	}
		
	}
 class MarketIndustry{
	 void Caroops(Car c1) {
		 c1.colour();
		 c1.price();
		 c1.speed();
		 
	 }
 }
	
	
	
		// TODO Auto-generated method stub
		
	


public class CarLaunch {

	public static void main(String[] args) {
		Innova i = new Innova();
		Kia k = new Kia();
	    Mercedes m = new Mercedes();
	    Maruthi s = new Maruthi();
	    MarketIndustry i1 = new MarketIndustry();
	    i1.Caroops(i);
	    i1.Caroops(k);
	    i1.Caroops(m);
	    i1.Caroops(s);
	    
		
		
		
		
		// TODO Auto-generated method stub

	}

}
