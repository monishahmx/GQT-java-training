package com.gqt.oopsprojs.package2;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Wecome to T0-do-List App");
		System.out.println("Dear user please select an option\n"
				+"1.Register\n"
				+"2.Login\n"
				+"3.Logout");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			Users.registerUser();
			MainApp.main(null);
		}
		case 2 :{
		boolean b=	Users.loginUser();
		if(b==true) {
			MainApp.main(null);
			
		}
		else {
			System.out.println("login falied");
			MainApp.main(null);
		}
			
		}
		default:
			System.out.println("INVALID ENTRY.Please try again");
			MainApp.main(null);
		}
		// TODO Auto-generated method stub

	}

}
