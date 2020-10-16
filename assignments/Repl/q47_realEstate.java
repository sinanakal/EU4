package Repl;

import java.util.Scanner;

public class q47_realEstate {

	public static void main(String[] args) {
		
		 //DO NOT CHANGE
	    int propertyPrice = 0; 
			int numberOfBedrooms, garageSpots;
			float metroAccessibility, schoolScore, highwayAccessibility;
			boolean backyard, smoking, garage;
			String houseType;
			Scanner scan = new Scanner(System.in);
			System.out.println("*****************************************");
			System.out.println("* Welcome to the RealEstate calculator! *");
			System.out.println("*****************************************");
			
			System.out.println("Enter your property type:");
			houseType = scan.nextLine();
			switch (houseType) {
			case "Condo":
				propertyPrice=50000;
				break;
			case "Townhouse":
				propertyPrice=75000;
				break;
			case "Single Family Home":
				propertyPrice=95000;
				break;
			}
			System.out.println("How many bedrooms do you have?");
			numberOfBedrooms = scan.nextInt();
			if(numberOfBedrooms>0) {
				propertyPrice += (numberOfBedrooms*30000);
			}
			System.out.println("Do you have a backyard?");
			backyard = scan.nextBoolean();
			if(backyard && houseType.toLowerCase().equals("condo")) {
				System.out.println("Backyard is not available for condo!");			
			}else if(backyard) {
				propertyPrice += 5000;
			}
			System.out.println("Do you have garage?");
			garage= scan.nextBoolean();		
			System.out.println( "How many spots?");
			garageSpots = scan.nextInt();
			if(garage&&(garageSpots>0&&garageSpots<=10)) {
				propertyPrice += garageSpots*20000;
			}else if(garage&&garageSpots>10) {
				System.out.println("Pardon, it's not a public parking!");			
			}
			System.out.println("How close is metro station?");
			metroAccessibility=scan.nextFloat();
			if (metroAccessibility<=1) {
				propertyPrice += 10000;
			}else if(metroAccessibility>1 && metroAccessibility<=3) {
				propertyPrice += 5000;
			}
			System.out.println("How close is highway?");
			highwayAccessibility=scan.nextFloat();
			if(highwayAccessibility<=1) {
				propertyPrice += 15000;			
			}else if(highwayAccessibility>1 && highwayAccessibility<=5) {
				propertyPrice += 8000;
			}else if(highwayAccessibility>5 && highwayAccessibility<=20) {
				propertyPrice += 4000;
			}
			System.out.println("What's the rating of nearest school?");
			schoolScore=scan.nextFloat();
			if(schoolScore<=10 && schoolScore>=8) {
				propertyPrice += 45000;
			}else if(schoolScore<8 && schoolScore>=4) {
				propertyPrice += 20000;
			}else {
				propertyPrice += 5000;
			}
			System.out.println("Does any of your family members smoking?");
			smoking=scan.nextBoolean();
			if (smoking) {
				propertyPrice -= 5000;
			}
			System.out.println("Market report has been generated.");		
			System.out.println("Your estimate market price is: "+propertyPrice+"$");
			scan.close();
	}

}
