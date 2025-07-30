package programs;
class Stu{
	String name;
	int rollNumber;
	int m1,m2,m3;
	float avg;
	Stu(String name,int rollNumber,int m1,int m2,int m3){
		this.name=name;
		this.rollNumber=rollNumber;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void calculateAverage() {
		avg=(m1+m2+m3)/3;
	}
	public void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("RollNumber:"+rollNumber);
		System.out.println("mark1:"+m1+"\tMARK2:"+m2+"\tmark3:"+m3);
		
		System.out.println("Average:"+avg);
	}
}


public class Studentclassdemo {
	public static void main(String []args) {
		Stu student1=new Stu("aksa",12,30,35,36);
		student1.calculateAverage();
		student1.displayDetails();
		Stu student2=new Stu("mariet",57,30,37,34);
		student2.calculateAverage();
		student2.displayDetails();
	}

}
