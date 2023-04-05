package Javaprogram;
import java.util.Scanner;

public class Conditional_Ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  number between 1-4:");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("The entered number is 1");
		}
		else if(num==2) {
			System.out.println("The entered number is 2");
			
			
		}
		else if(num==3) {
			System.out.println("The entered number is 3");
			
		}
		else if(num==4) {
			System.out.println("The entered number is 4");
		}
		else {
			System.out.println("The entered number is wrong read the question properly ");
		}
		// TODO Auto-generated method stub

	}

}
