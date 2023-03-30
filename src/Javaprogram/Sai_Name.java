package Javaprogram;
import java.util.Scanner;
public class Sai_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  the value:");
	int n = sc.nextInt();
	for(int i=0;i<=n-1;i++) {
		for (int j=0;j<=n-1;j++) {
			if(i==0||i==(n-1)/2||i==n-1||
					(i==1 && j==0)||(i==2 &&  j==0)||
					(i==3 && j==0)||(i==4 && j==0)
					||(i==6 && j==n-1)||(i==7 &&  j==n-1)||
					(i==8 && j==n-1)||(i==9 && j==n-1)
					){	
			System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
			
			
		}
		System.out.print("     ");
		//Symbol A
		for(int j=0;j<=n-1;j++) {
			if(j==0||(j==n/2)||(i==0 && j<=(n/2))||(i==n/2 && j<=n/2)) {
				System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
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
		for(int j=0;j<=n-1;j++) {
			if(i-j==n/2 && i>n/2 
				||i+j==n-1+n/2 && i>n/2
				||j==0 && i<n/2 && i!=0
				||j==n-1 && i<n/2 && i!=0
				||i==j && i<=n/2 && i!=0
				||i+j==n-1 &&i<=n/2 && i!=0
				)
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


