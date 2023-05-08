package Javaprogram;
import java.util.Scanner;
class Mathematic{
	int powerapp(int base,int exponent ) {
		int power = 1;
		for(int i =1;i<=exponent;i++) {
			power = power*base;
		}
		return power;
	}
}

public class Power_Of_A_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and exponent");
		int base = sc.nextInt();
		int exponent =sc.nextInt();
		Mathematic m1 = new Mathematic();
	int 	res=m1.powerapp(base, exponent);
	//double res1=  Math.pow( base,exponent);
		System.out.println("The power of the "+base+ "to the"+exponent+"is"+res1);
		
		// TODO Auto-generated method stub

	}

}
