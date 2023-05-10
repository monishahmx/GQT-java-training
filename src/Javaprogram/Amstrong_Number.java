package Javaprogram;
import java.util.Scanner;
class CountApp{
	int number(int num) {
		int count = 0;
		while(num!=0) {
			int  digits = num%10;
			count++;
			num=num/10;
		}
		return count;
	}
}
class Maths{
	int numb(int num,int vaule) {
		int sum = 0;
		if(num==0) {
			return 0;
		}
		while(num!=0) {
			int digit = num%10;
			int result = (int) Math.pow(digit, vaule);
			sum = sum+result;
			num=num/10;
		}
		return sum;
		
		
	}
}


public class Amstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		CountApp c = new CountApp();
		int vaule = c.number(num);
		Maths m = new Maths ();
		int answer =m.numb(num, vaule);
		if(num==answer) {
			System.out.println("The given number is a Amstrong Number");
		}
		else {
			System.out.println("The given number is not a Amstrong Number");
		}
		
		
		// TODO Auto-generated method stub

	}

}
