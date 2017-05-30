package ageCalculator;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		int date;
		int month;
		int year;
		String answer;
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Enter your Birthdate");
			date = scan.nextInt();
			month = scan.nextInt();
			year = scan.nextInt();
			
			System.out.println("Would you like to enter details for another client? (Y/N)");
			 answer = scan.next();
		}while(answer.equalsIgnoreCase("Y"));
		
		if(answer.equalsIgnoreCase("N"))
		{
			System.out.println("Thanks for using the age calculator!");
		}

	}

}
