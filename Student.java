package StudentDBapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	
	//Constructor: name and year 
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("Enter Grade Year:\n 1 - First Year\n 2- Second Year\n 3 - Third Year\n 4 - Final Year: ");
		this.gradeYear = in.nextInt();
		
		
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " in class" + gradeYear + " " + studentID );
		
		
		
		//System.out.println("Enter courses ");
		//this.courses = in.nextint();
		
		
		
		
		
		
	}
	// Generate an ID
	
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID= gradeYear + "" + id;
		
	}
	
	// Enroll on courses
	public void enroll() {
		//Use a loop, ends when the user hits 0
		do {
			System.out.println("Enter the course to enroll (Q to quit) ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
				
			} 
			else {
				break;
				}
			
		} while (1 != 0);
			
		

	}
			
			
	//View balance and pay tuition
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		System.out.println("Your balance is: $" + tuitionBalance);
		System.out.println("Enter your payment! $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $" + payment);
		viewBalance();
	}
		
	// Show status 	
		
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nCourses Enrolled:" + courses + 
				"\nBalance: $" + tuitionBalance;
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		}
		
	