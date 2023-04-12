package Javaprogram;
import java.util.Scanner;

public class Greatest_Of_Three_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the  numbers n1:");
		int n1 = sc.nextInt();
		System.out.println("Enter  the  numbers n2:");
		int n2 = sc.nextInt();
		System.out.println("Enter  the  numbers n3:");
		int n3 = sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1+"is the greatest");
			
			
			
		}
		else if (n2>n1&& n2>n3) {
			System.out.println(n2+"is the greatest");
			
		}
		else {
			System.out.println(n3+"is the greatest");
		}
		
		
		// TODO Auto-generated method stub

	}

}
