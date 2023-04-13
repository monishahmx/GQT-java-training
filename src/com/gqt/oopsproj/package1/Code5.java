package com.gqt.oopsproj.package1;
//The usage of this keyword with the instance will help the complier to 
//Distinguish between the Instance and the local variable 
//The variables with the this keyword is association with the 
//Instance variables
//Instance Variables are also called as Object Variables are memory will
//be created along with the object
class Cat2{
	private String name;
	private int price;
	private int age;
	private String breed;
	private String color;
	
	void setData(String name,int price,int age,String breed,String color) {
		this.name = name;//Shadowing scenario
		this.price =price;//Shadowing scenario
		this.age = age;//Shadowing scenario
		this.breed = breed;//Shadowing scenario
		this.color = color;//Shadowing scenario
		
	}
	void getData (){
		System.out.println(name);
		System.out.println(price);
		System.out.println(age);
		System.out.println(breed);
		System.out.println(color);
	}
    
}


public class Code5 {

	public static void main(String[] args) {
		Cat2 c1 = new Cat2();
		c1.setData("tommy", 200, 4,"GR" , "White");
		c1.getData();
		// TODO Auto-generated methgod stub

	}

}