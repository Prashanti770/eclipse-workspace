package controlstatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		System.out.println("Enterd marks are:"+marks);
		
		switch(marks) {
			case 500:  
				System.out.println("marks equal to 500 , Eligible for A+");
				break;
			
			case 400 : 
				System.out.println("marks equals to 400 , Eligible for A");
				break;
			
			case 300 : 
				System.out.println("marks are equal to 300 , Eligible for B+");
				break;
			
			case 200 : 
				System.out.println("marks are equal to 200 , Eligible for B");
				break;
			
		    default :
		    	System.out.println("enter marks below 500 only");
		
	}
System.out.println("All the best for Future!!");
}
}