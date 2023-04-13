package com.gqt.methodprojs.package1;
class Demo1{
	void sumofnaturalnum() {
		int sum =0;
		for(int i =1;i<=5;i++) {
			sum = sum+i;
			
		}
		System.out.println("sum of first 5 natural numbers is "+  sum);
	}
}

public class Sum_of_5_Natural_Num {

	public static void main(String[] args) {
		Demo1 d1 =new Demo1(); 
		d1.sumofnaturalnum();
		// TODO Auto-generated method stub

	}

}
