package ageCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		int date;
		int month;
		int year;
		
		
		String answer;
		Scanner scan = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		
		
		do{
			System.out.println("Enter your Birthdate in a format MM DD YYYY");
			
			month = scan.nextInt();
			date = scan.nextInt();
			year = scan.nextInt();
			
			LocalDate birthday = LocalDate.of(year, month, date);
			Period p = Period.between(birthday, today);
			
			System.out.print("You are "+p.getYears()+" Years ");
			System.out.print(p.getMonths()+ " months "+ "and ");
			System.out.println(p.getDays()+ " days "+ " old ");
			
			
			System.out.println("Would you like to enter details for another client? (Y/N)");
			 answer = scan.next();
		}while(answer.equalsIgnoreCase("Y"));
		
		if(answer.equalsIgnoreCase("N"))
		{
			System.out.println("Thanks for using the age calculator!");
		}

		scan.close();
	}

}
