package Javaprogram;
import java.util.Scanner;
class RevApp{
	int numapp(int num) {
		int digit=0;
		int rev=0;
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
		
	}
}

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int num = sc.nextInt();
		RevApp r1 = new RevApp();
		int res = r1.numapp(num);
		System.out.println("The reverse of the given number is "+res);
		
		// TODO Auto-generated method stub

	}

}
