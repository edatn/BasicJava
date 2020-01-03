package StudentDatabase;

import java.util.Scanner;

public class studentdatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many new users want to add
        System.out.println("enter number of new student to : ");
        Scanner in = new Scanner(System.in);
        int numofstu= in.nextInt();
        Student[] students=new Student[numofstu];
		
		//Create n number of new student
        for(int n=0; n< numofstu ; n++) {
        	students[n] =new Student();
        	students[n].enroll();
        	students[n].paytuition();  	
        }
        for(int n=0; n< numofstu ; n++) { 
        System.out.println(students[0].toString());	
	}
	
}}