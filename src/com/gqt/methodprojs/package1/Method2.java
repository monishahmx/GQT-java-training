package com.gqt.methodprojs.package1;
//method with input and no output
class Square{
	void findsquare( int num) {
		
		int square = num*num;
			System.out.println("Square of a number"+num+"is"+square);

		
	}
}

public class Method2 {

	public static void main(String[] args) {
		Square sd = new Square();
		sd.findsquare(26);
		// TODO Auto-generated method stub

	}

}