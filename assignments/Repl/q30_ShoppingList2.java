package Repl;

import java.util.Scanner;

public class q30_ShoppingList2 {

	public static void main(String[] args) {
		String item1, item2, item3, report, report2, report3;
		double price1, price2, price3, totalPrice;
		int count1, count2, count3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Item1, count and its price:");
		item1=scan.next();
		count1=scan.nextInt();
		price1=scan.nextDouble();
		
		System.out.println("Enter Item2, count and its price:");
		item2=scan.next();
		count2=scan.nextInt();
		price2=scan.nextDouble();
		
		System.out.println("Enter Item3, count and its price:");
		item3=scan.next();
		count3=scan.nextInt();
		price3=scan.nextDouble();
		
		if (count2 > 0 ) {
			report2 = ", Item2: "+item2+" Price: "+price2*count2;
		}else {
			report2="";
		}
		if (count3 > 0) {
			report3 = ", Item3: "+item3+" Price: "+price3*count3;
		}else {
			report3="";
		}
		String report1="Item1: "+item1+" Price: "+price1*count1; 
		totalPrice=price1*count1+price2*count2+price3*count3;
	    report= report1+report2+report3;
	    
	    System.out.println(report);
	    System.out.println("Total price: "+totalPrice);
	    scan.close();
	}

}
