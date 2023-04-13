package com.gqt.oopsproj.package1;
class Fish{
	private String name;
	private int price;
	private int age;
	private String breed;
	private String color;
	
	void setData(String a,int b,int c,String d,String e) {
		name = a;
		price =b;
		age = c;
		breed = d;
		color = e;
		
	}
	void getData (){
		System.out.println(name);
		System.out.println(price);
		System.out.println(age);
		System.out.println(breed);
		System.out.println(color);
	}
    
}

public class Code3 {

	public static void main(String[] args) {
		Fish f1 = new Fish();
		f1.setData("Tommy", 2000, 1, "GR", "White");
		f1.getData();
		
		// TODO Auto-generated method stub

	}

}
