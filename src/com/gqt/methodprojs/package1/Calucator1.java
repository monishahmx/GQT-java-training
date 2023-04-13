package com.gqt.methodprojs.package1;
class Calulator{
         int add(int a ,int b) {
        	 return a+b;
         }
         float add (float a,float b) {
        	 return a+b;
         }
         double add (double a ,double b) {
        	 return a+b;
         }
         int add (int a, int b, int c) {
        	 return a+b+c;
        			 
        			 
        			 
         }
         
}

public class Calucator1 {

	public static void main(String[] args) {
		Calulator v1 = new Calulator();
		System.out.println(v1.add(10,20));
		System.out.println(v1.add(18, 29, 10));
		System.out.println(v1.add(17.9, 14.6));
		
		
		// TODO Auto-generated method stub

	}

}
