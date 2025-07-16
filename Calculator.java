package programs;
import java.util.Scanner;

public class Calculator {


	

	

		public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("enter number1");
			int num1=sc.nextInt();
			System.out.println("enter number2");
			int num2=sc.nextInt();
			System.out.println("1:ADDITION");
			System.out.println("2:SUBTRACTION");
			System.out.println("3:MULTIPLICATION");
			System.out.println("4:DIVISION");
			int choice=sc.nextInt();
			
			if (choice==1) {
				System.out.println(num1+num2);
			}
			if (choice==2) {
				System.out.println(num1-num2);
			}
			if (choice==3){
				System.out.println(num1*num2);
			}
			if (choice==4) {
				if(num2==0) {
					System.out.println("number2 must not be 0");
					
				}
				else {
				System.out.println(num1/num2);
				choice++;
			}
				
			
			
		
			
			
			
		}}
}
