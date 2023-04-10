package Javaprogram;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("To vheck wheather the given number is even or odd");
		if(n==0 || n%2==0) {
			System.out.println("The number " + n + "is even");
			
		
			
		}
		else {
			System.out.println("The number" + n + "is odd");
		}
		// TODO Auto-generated method stub

	}

}
