package programs;

import java.util.Scanner;
class Student{
	int age;
	String name;
	public void dispalydetails() {
		System.out.println("student name:"+name);
		System.out.println("student name:"+age);
	}
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		Student student=new Student();
		System.out.println("student name");
		student.name=scanner.nextLine();
		System.out.println("student AGE");
		
		
		student.age=scanner.nextInt();
		student.dispalydetails();
		scanner.close();
	}
	


	
	
	
	
	
}


