package com.gqt.methodprojs.package1;
//method with no input and no output
class SquareDemo{
	void findsquare() {
		int n =20;
		int square = n*n;
			System.out.println("Square of a number"+n+"is"+square);

		
	}
}

public class Method1 {

	public static void main(String[] args) {
		SquareDemo sd = new SquareDemo();
		sd.findsquare();
		// TODO Auto-generated method stub

	}

}
