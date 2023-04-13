package com.gqt.oopsproj.package1;
class Cricket{
	String name;
	int age;
	int jersey;
	int runs;
	String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJersey() {
		return jersey;
	}
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

public class Code6 {

	public static void main(String[] args) {
		Cricket c1  = new Cricket();
		c1.setName("Amruth");
		c1.setAge(22);
		c1.setJersey(13);
		c1.setRuns(1000);
		c1.setCountry("India");
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getJersey());
		System.out.println(c1.getRuns());
		System.out.println(c1.getCountry());
		
		
		// TODO Auto-generated method stub

	}

}
