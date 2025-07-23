package programs;

import java.util.Scanner;

public class Grade {


	public static void main(String args[]) {
		
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    
    System.out.println("enter mark");
    int mark=sc.nextInt();
    if(mark >=90){
    	System.out.println("the grade is A");
    }
    else if(mark>=75) {
    	System.out.println("the grade is B");
    }
    else if(mark>=60) {
    	System.out.println("the grade is C");
    }
    else if(mark>=40) {
    	System.out.println("the grade is D");
    }
    else {
    	System.out.println("failed");
    }
    	
    	
	}
    

}