package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class Arraycode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the students:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of the student:"+(i+1));
			arr[i]= sc.nextInt();
			
		}
		System.out.println("## --- Marsk Obtained --- ##");
		for (int i=0;i<n;i++) {
		System.out.println("Marks of student:"+(i+1)+" is :"+arr[i]);
		// TODO Auto-generated method stub

	}

}
}
