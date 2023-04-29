package com.gqt.oopsprojs.package2;

import java.util.Scanner;

public class Users {
	private  static int id;
	private static String name;
	private static String pwd;
	public static Scanner sc = new Scanner(System.in);
	public static String uname[] = new String[10];
	public static String upassword[] = new String[10];
	public static int temp=0;
	
	
	


	public Users(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public static void registerUser() {
		System.out.println("Enter the username:");
		
		uname[temp] = sc.next();
		System.out.println("Enter the password:");
		upassword[temp] = sc.next();
		temp++;
		System.out.println("User Registered");
	}

	public static boolean loginUser() {
		System.out.println("Enter the username:");
		name = sc.next();
		System.out.println("Enter the password:");
		pwd = sc.next();
		for( int i=0;i<uname.length;i++) {
			if(uname[i].equals(name) &&
					upassword[i].equals(pwd)) {
				System.out.println("Login is Sucessful");
				return true;
			}
			
			 
		}
		return false;
	}
	

}
