package Repl;

import java.util.Scanner;

public class q151_Signum {
	
	public static void sign(int n)
	  {
	    //your code here
	    if(n<0){
	      System.out.println(-1);
	    }else if(n>0){
	      System.out.println(1);
	    }else if(n==0){
	      System.out.println(0);
	    }
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	    inp.close();
	  }

}
