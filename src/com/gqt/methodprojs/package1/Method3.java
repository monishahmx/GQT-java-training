package com.gqt.methodprojs.package1;
//method with no input and BUT output
class SumDemo{
	int findsquare() {
		int n =20;
		int square = n*n;
			//System.out.println("Square of a number"+n+"is"+square);
		return square;

		
	}
}

public class Method3 {

	public static void main(String[] args) {
		SumDemo sd = new SumDemo();
		 int res = sd.findsquare();
		 System.out.println("Square" + res);
		// TODO Auto-generated method stub

	}

}