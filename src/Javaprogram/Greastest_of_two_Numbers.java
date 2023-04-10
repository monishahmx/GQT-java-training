package Javaprogram;
import java.util.Scanner;
public class Greastest_of_two_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number n1:");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number n2:");
		int n2 =sc.nextInt();
		System.out.println("To find out the Greatest of two numbers");
		if(n1>n2) {
			System.out.println(n1+"is the greatest number");
		}
		else {
			System.out.println(n2+"is the greatest number");
			
		}
		// TODO Auto-generated method stub

	}
}

