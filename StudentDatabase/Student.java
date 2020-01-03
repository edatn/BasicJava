package StudentDatabase;

import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses="";
	private int tuitionbalance=0;
	private static int costofCourses=600;
	private static int id=1001;
	
	//constructor:prompt user to enter student's name and year
    public Student() {
    	Scanner in =new Scanner(System.in);
    	System.out.print("Enter student first name: ");
    	this.firstname=in.nextLine();
    	
    	System.out.print("Enter student last name: ");
    	this.lastname=in.nextLine();
    	
    	System.out.println("1-Freshmen");
    	System.out.println("2-Sophmore");
    	System.out.println("3-Junýor");
    	System.out.println("4-Senýor");
    	System.out.print("Enter student class level: ");
    	this.gradeyear=in.nextInt();
    	
    	setStudentID(); 
    }	
	
	//generate an ID 
    private void setStudentID() {
		 id++;
		 this.studentID = gradeyear + "" + id; 
	 }
     
	//Enroll in courses
	public void enroll() {
		do {
		System.out.print("enter course to enroll: ");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionbalance= tuitionbalance + costofCourses;			
		}
		else {
			//System.out.println("Break");
			break;
		   }
		} while (1 != 0);
		
	} 
	//for view balance
	public void viewbalance() {
		System.out.println("your balance is : $" + tuitionbalance);
	}
	public void paytuition() {
		viewbalance();
		System.out.println("enter your payment: ");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		tuitionbalance = tuitionbalance - payment;
		System.out.println("thank you for your payment of $ " + payment);
		viewbalance();
	}
	
	//show status
	public String toString() {
		return "Name: "+ firstname + " " + lastname +
				"\ngrade level: " + gradeyear +
				"\nCourses: " + courses +
				 "\nbalance: " + tuitionbalance;
	}
}
