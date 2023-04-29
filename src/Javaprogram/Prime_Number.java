package Javaprogram;
import java.util.Scanner;
class PrimeApp{
	boolean isPrime (int n) {
		if(n==0 ||n==1) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			for(int i =2;i<n;i++) {
				if(n%i==0) {
					return false;
					
				}
			
		}
			return true;
		
		}
		
}
}

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check weather the given number is prime or not");
		int n = sc.nextInt();
		PrimeApp p = new PrimeApp();
		boolean res = p.isPrime(n);
		if(res == true) {
			System.out.println("The given number "+n+ "is   a prime number");
		}
		else {
			System.out.println("The given number "+n+"is not a prime number");
		}
		// TODO Auto-generated method stub

	}

}
