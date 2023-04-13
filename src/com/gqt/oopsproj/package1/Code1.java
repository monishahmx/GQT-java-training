package com.gqt.oopsproj.package1;
//Write a program where encapsulation is not present
class Dog{
	String name;
	int price;
	int age;
	String breed;
	String color;
}



public class Code1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name="tommy";
		d1.price=2000;
		d1.age=2;
		d1.breed="bull";
		d1.color="brown";
		
		System.out.println(d1.name);
		System.out.println(d1.price);
		System.out.println(d1.age);
		System.out.println(d1.breed);
		System.out.println(d1.color);
		
		//As seen in the above code we are able to access the class even inside  the 
		//main method
		// TODO Auto-generated method stub

	}

}
