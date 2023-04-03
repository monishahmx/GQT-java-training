package com.gqt.arraysproj.package1;
import java.util.Scanner;


public class Test_Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of University one:");
		String Uni = sc.next();
		System.out.println("Enter the count of colleges inside the University:");
		int col  = sc.nextInt();
		System.out.println("Enter the count of classes rooms inside each colleges:");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students in each class:");
		int stu = sc.nextInt();
		int arr[][][]= new int[col][cls][stu];
		for (int i=0;i<col;i++){
			System.out.println("Inside the college:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("class :"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("The marks obtained by the students are:"+(k+1));
					arr[i][j][k]=sc.nextInt();
					
				}
				
			}
		}
		for(int i=0;i<col;i++) {
			System.out.println("Inside the college:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("The class :"+(j+1)+"inside the college:"+(i+1));
				for(int k=0;k<stu;k++) {
					System.out.println("the marks of the student:"+(k+1)+"is:"+arr[i][j][k]);
					
				}
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}

