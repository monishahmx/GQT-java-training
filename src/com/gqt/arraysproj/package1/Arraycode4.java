package com.gqt.arraysproj.package1;
import java.util.Scanner;


public class Arraycode4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the count of university:");
		int uni = sc.nextInt();
		System.out.println("Enter the count of Schools:");
		int sch = sc.nextInt();
		System.out.println("Enter the count of the class:");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students:");
		int stu = sc.nextInt();
		int arr [][][][]= new int[uni][sch][cls][stu];
		
		for(int i=0;i<uni;i++) {
			System.out.println("Inside University:"+(i+1));
		
		
		for (int j=0;j<sch;j++){
			System.out.println("Inside School"+(j+1));
			for (int k=0;k<cls;k++) {
				System.out.println(" Class inside the school :"+(k+1));
			
				for(int l=0;l<stu;l++) {
					System.out.println("Enter the marks of the student:"+(l+1));
					
	
				arr[i][j][k][l] = sc.nextInt();
				}
			}
		}
				
}
		for (int i=0;i<uni;i++) {
			System.out.println("Inside uni :"+(i+1));
		
		for (int j=0;j<sch;j++){
			System.out.println("Inside School:"+(j+1));
			for(int k=0;k<cls;k++) {
				System.out.println("class "+(k+1)+"  in the schcool  :"+(j+1));
			
			for(int l=0;l<stu;l++) {
			
				System.out.println("The marks of the students :"+(l+1)+"is:"+arr[i][j][k][l]);
				
			}
			
			}
			
		}
		}
		 
		// TODO Auto-generated method stub

	}

}
