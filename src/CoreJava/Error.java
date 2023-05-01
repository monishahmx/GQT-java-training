package CoreJava;
import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num n1:");
		int n1 = sc.next();//syntax error
		System.out.println("Enter the first num n2:");
		int n2 = sc.next();
		int res = n1/n2;
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
