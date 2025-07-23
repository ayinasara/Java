package programs;
import java.util.Scanner;


public class Oddno {
	public static void main(String args[]) {
		Scanner sc=new Scanner("System.in");
		System.out.println("enter n");
		
		for(int i=0;i<=50;i++) {
			if (i%2==0) {
			continue;
				
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
