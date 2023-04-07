package com.gqt.stringsproj.package1;
import java.util.Scanner;


public class Vowels_Consonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be counted:");
		String str = sc.next();
		str= str.toLowerCase();
		int vow_count = 0;
	    int con_count =0;
	      for(int i = 0;i<str.length();i++) {
					if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
						||str.charAt(i)=='o'||str.charAt(i)=='u'){
						vow_count++ ;
					}
						else {
							con_count++;
						}
						
					}
	     
	    	  System.out.println("Number of Vowels present is"+vow_count);
	    	  System.out.println("Number of Consonants is "+con_count);
	      }
	      
				}
	      
		
		// TODO Auto-generated method stub



