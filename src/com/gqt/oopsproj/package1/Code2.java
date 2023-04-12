package com.gqt.oopsproj.package1;
class Cat{
	private String name;
	private int price;
	private int age;
	private String breed;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

public class Code2 {

	public static void main(String[] args) {
		Cat d1 = new Cat ();
		d1.setName("tommy");
		d1.setPrice(2000);
		d1.setAge(2);
		d1.setBreed("bull Dog");
		d1.setColor("Brown");
		
		
		System.out.println(d1.getName());
		System.out.println(d1.getPrice());
		System.out.println(d1.getAge());
		System.out.println(d1.getBreed());
		System.out.println(d1.getColor());
		// TODO Auto-generated method stub

	}

}
