package com.gqt.oopsproj.package1;
//It is a scenario in which complier is confused between differentiating 
//INstance and Local Variable .And Default vaules will be retained 
//in the instance variable 
class Cat1{
	private String name;
	private int price;
	private int age;
	private String breed;
	private String color;
	
	void setData(String name,int price,int age,String breed,String color) {
		name = name;//Shadowing scenario
		price =price;//Shadowing scenario
		age = age;//Shadowing scenario
		breed = breed;//Shadowing scenario
		color = color;//Shadowing scenario
		
	}
	void getData (){
		System.out.println(name);
		System.out.println(price);
		System.out.println(age);
		System.out.println(breed);
		System.out.println(color);
	}
    
}


public class Code4 {

	public static void main(String[] args) {
		Cat1 c1 = new Cat1();
		c1.setData("tommy", 200, 4,"GR" , "White");
		c1.getData();
		// TODO Auto-generated methgod stub

	}

}
