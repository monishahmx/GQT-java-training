import java.util.Scanner;
 public class Conditional {
	 public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println ("Enter the age:");
		 int age = sc.nextInt();
		 if (age<18) {
			 System.out.println("You are too young  to get married soon ");
			 }
		 else if(age>65) {
			 System.out.println("You are too old to get married ");
			 }
		 else {
			 System.out.println("You are the perfect Bride/Groom");
		 }