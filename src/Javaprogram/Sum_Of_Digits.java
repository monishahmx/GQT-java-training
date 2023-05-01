package Javaprogram;
import java.util.Scanner;
class SumApp{
	int findsum(int num) {
		int digit=0;
		int sum=0;
		while(num!=0) {
			digit = num%10;
			sum=sum+digit;
		    num =num/10;
		}
		return sum;
	}
}

public class Sum_Of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to num to find the sum of the digits:");
		int num = sc.nextInt();
		SumApp s1 = new SumApp();
		int res = s1.findsum(num);
		System.out.println("The sum of digits"+ num + " is "  +res);
		
		// TODO Auto-generated method stub

	}

}
