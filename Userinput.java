package programs;
import java.util.Scanner;



public class Userinput {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		System.out.println("the number is:"+number);
		if(number>0) {
			System.out.println("the number is positive");
		}
		else if(number<0)
		{ 
			System.out.println("the number is negative");
		}
		else
		{
		System.out.println("the number is 0");
		}
	}

}



