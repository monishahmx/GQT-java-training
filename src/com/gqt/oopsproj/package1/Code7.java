package com.gqt.oopsproj.package1;


class Cricketer3 extends Players {
	String name;
	String country;
	int age;
	int runs;

     public Cricketer3(){
    	 super();
	   name="Dhoni";
	   country="India";
	   age=39;
	   runs=30000;
	   
			 
}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public int getAge() {
		return age;
	}

	public int getRuns() {
		return runs;
	}
}

public class Code7 {

	public static void main(String[] args) {
		Cricketer3 c2 = new Cricketer3(); 
		System.out.println(c2.getName());
		System.out.println(c2.getCountry());
		System.out.println(c2.getAge());
		System.out.println(c2.getRuns());
		
		
		// TODO Auto-generated method stub

	}

}
