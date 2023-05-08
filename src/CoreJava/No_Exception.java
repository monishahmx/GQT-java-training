package CoreJava;
import java.util.Scanner;
class BankAmount{
	

	void bankapp() {
		System.out.println("Login into the Account");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount = sc.nextInt();
		System.out.println("Amount Deposited is "+amount);
		System.out.println("Logout from the Account");
		
		
		
	}
}

public class No_Exception {

	public static void main(String[] args) {
		BankAmount b1= new BankAmount();
		b1.bankapp();
		// TODO Auto-generated method stub

	}

}
