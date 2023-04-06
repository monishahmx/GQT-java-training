package com.gqt.arraysproj.package1;
import java.util.Scanner;


public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the students");
		int stu =sc.nextInt();
		int arr[] = new int[stu];
		for(int i =0;i<stu;i++) {
			System.out.println("Enter the marks of the students:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Marks Obtained");
		for(int i=0;i<stu;i++ ) {
			System.out.println(" Marks obtained by student "+(i+1)  + "is" +arr[i]);
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
