package Javaprogram;
import java.util.Scanner;

public class Sum_Natural {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the vaule of n :");
		int n = sc.nextInt();
		int sum=0;
		for( int i=1;i<=n;i++) {
		
			sum=i+sum;
			
		}
		System.out.println("The sum of the first n natural number is "+sum);
		// TODO Auto-generated method stub

	}

}
