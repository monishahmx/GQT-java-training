package Javaprogram;
import java.util.Scanner;

public class Userdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name :");
		String name =sc.next();
		 
		System.out.println("Enter the your Age");
		int age = sc.nextInt();
		
		System.out.println("Enter your home town:");
		String home =sc.next();
		
		System.out.println("Enter your ID:");
		int id=sc.nextInt();
		 
		System.out.println("Enter your Room no:");
		int room=sc.nextInt();
		
		
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Place "+home);
		System.out.println("ID "+id);
		System.out.println("Room no  "+room);
		 
		
		
		
		// TODO Auto-generated method stub

	}

}
