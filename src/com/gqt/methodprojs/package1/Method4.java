package com.gqt.methodprojs.package1;
//method with no input and no output
class Demo{
	int  findsquare(int n) {
				int square = n*n;
			
			return square;

		
	}
}  

public class Method4 {

	public static void main(String[] args) {
		Demo sd = new Demo();
		 int res = sd.findsquare(20);
		 System.out.println("Square" + res);
		// TODO Auto-generated method stub

	}

}