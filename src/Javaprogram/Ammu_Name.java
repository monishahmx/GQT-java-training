package Javaprogram;
import java.util.Scanner;
public class Ammu_Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0||i==0||j==n-1||i==(n-1)/2) {
					System.out.print("#");
					
				}
				else {
					System.out.print(" ");
					
				}
			}
			System.out.print("   ");
			
			
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
				System.out.print("   ");
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
				for(int j=0;j<=n-1;j++) {
					if(j==0||j==n-1||i==n-1) {
						System.out.print("#");
						
					}
					else {
						System.out.print(" ");
						
					}

				
		
		
		// TODO Auto-generated method stub
		

	}
				System.out.print("   ");
				for(int j=0;j<=n-1;j++) {
					if(i-j==n/2 && i>n/2 
						||i+j==n-1+n/2 && i>n/2
						||j==0 && i<n/2 && i!=0
						||j==n-1 && i<n/2 && i!=0
						||i==j && i<=n/2 && i!=0
						||i+j==n-1 &&i<=n/2 && i!=0
						)
					{
						System.out.print("@");
					}
					else {
						System.out.print("  ");
					}
					
				}
				System.out.println();

		}
}
}
	
