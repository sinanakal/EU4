package Repl;

import java.util.Scanner;

public class q41_PosNegZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	    
	    if (number==0) {
	    	System.out.println("it is zero");
	    }else if(number>0) {
	    	System.out.println(number+" is positive");
	    }else {
	    	System.out.println(number+" is negative");
	    }
	    input.close();
	}

}
