package Javaprogram;
import java.util.Scanner;
public class Moni {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  the value:");
	int n = sc.nextInt();
	for(int i=0;i<=n-1;i++) {
		for (int j=0;j<=n-1;j++) {
			if(j==0
					|| j==n-1
					
					|| i==j && j<(n-1)/2 ||
					j+i==n-1 && i<(n-1)/2 ) {	
			System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
			
			
		}
		System.out.print("    ");
		//Symbol O
		for (int j=0;j<=n-1;j++) {
			if(i==0||i==n-1||j==0||j==n-1) {
				System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
		//Symbol N 
		for(int j=0;j<=n-1;j++) {
			if(j==0||i==j||j==n-1) {
				System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
		//Symbol I
		for(int j=0;j<=n-1;j++) {
			if(i==0 
				|| i==n-1
				|| j==n/4 )
			{
				System.out.print("#");
			}
			else {
				System.out.print("  ");
			}
	}
		System.out.println();
	
	
		
		// TODO Auto-generated method stub

	}

}
}

