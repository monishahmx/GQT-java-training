package com.gqt.arraysproj.package1;
import java.util.Scanner;


public class Arrraycode5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the count of classs:");
		int cls = sc.nextInt();
		int arr[][] = new int[cls][];
		 for(int i= 0;i<arr.length;i++) {
		System.out.println("Enter the count of the students inside the class:"+(i+1));
		arr[i]= new int[sc.nextInt()];
		 }
		
		
		for (int i=0;i<arr.length;i++){
			System.out.println("Inside class:"+(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of the students:"+(j+1));
				arr[i][j] = sc.nextInt();
				
			}
			
			
			
		}
		for (int i=0;i<arr.length;i++){
			System.out.println("Inside class:"+(i+1));
			for(int j=0;j<arr[1].length;j++) {
				System.out.println("The marks of the students :"+(j+1)+ "is :"+arr[i][j]);
			}
			
			
			
		}
		 
		// TODO Auto-generated method stub

	}

}
