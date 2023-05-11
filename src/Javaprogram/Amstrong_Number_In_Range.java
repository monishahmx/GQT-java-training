package Javaprogram;
import java.util.Scanner;
class CountApps{
            int numb(int num) {
            	int count =0;
            	while(num!=0) {
            		int digit = num%10;
            		count++;
            		num = num/10;
            	}
            	return count;
		
	}
}
 
class Mathematics{
	int number(int num,int vaule) {
		int sum =0;
		if(num==0) {
			return 0;
		}
		while(num!=0) {
			int digit = num%10;
			int res = (int) Math.pow(num, vaule);
			sum = sum+res;
			num = num/10;
		}
		return sum;
	}
}

public class Amstrong_Number_In_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to find the amstrong numbers between the given range");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		int count =0;
		for(int i = num1;i<=num2;i++) {
			CountApps c1  = new CountApps();
			int vaule = c1.numb(i);
			Mathematics m = new Mathematics();
			int result =m.number(i, vaule);
			if (i == result) {
				System.out.println(i+ "is a Amstrong Number");
				count++;
			}
		}
		System.out.println("There is"+count+"Amstrong Numbers between "+num1+"and"+num2);
		
		// TODO Auto-generated method stub

	}

}
