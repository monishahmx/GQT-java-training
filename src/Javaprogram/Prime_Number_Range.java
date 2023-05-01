package Javaprogram;
import java.util.Scanner;
class Primeapps{
	boolean checkprime(int n) {
		if(n==0||n==1) {
			return false;
		}
		else if(n==2) {
			return true;
			
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
	return true;
}
}

public class Prime_Number_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two numbers in a given range to find the prime numbers between them:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Primeapps p = new Primeapps();
		for(int i =a;i<b;i++) {
			boolean res = p.checkprime(i);
			if(res==true) {
				System.out.println("The prime  numbers between the given range are"+i);
			}
		}
		
		// TODO Auto-generated method stub

	}

}
