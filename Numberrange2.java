package programs;
import java.util.Scanner;

public class Numberrange2 {
	

	

		public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter range number");
			int range=sc.nextInt();
			int i=0;
			
			while(i<range) {
				System.out.println(i);
				i++;
			}
}}
