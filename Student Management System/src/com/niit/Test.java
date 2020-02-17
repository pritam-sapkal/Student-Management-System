package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test
{
	private static List<Student> rec;
	private static int noOfRecords,count;
	private static Scanner s = null;
	private static Connection con=null;
	static 
	{
		count=10000;
				System.out.println("Enter the number of students you want to store in database");
		s = new Scanner(System.in);
		noOfRecords = s.nextInt();
		
		
		
	}

	public static void main(String[] args) 
	{
		
		Set<String> courses=new HashSet<>();
			System.out.println("1. Add Studnet");
			System.out.println("2. view all records");
			System.out.println("3. Exit");
			System.out.println("Enter your choice\n");
			int choice=s.nextInt();
			switch(choice)
			{
			
			case 1:
				System.out.println("Enter the first name,last name, year of student");
				String fName=s.next();
				String lName=s.next();	
				int year=s.nextInt();
				
				System.out.println("Enter courses");
				String c1=s.next();
				String c2=s.next();
				String c3=s.next();
				courses.add(c1);
				courses.add(c2);
				courses.add(c3);
			
			int totalPayment=45000*3;
			System.out.println("Enter the payment");
			int feesPaid=s.nextInt();
			int feesPending=totalPayment-feesPaid;
			Student s=new Student(fName, lName, courses, feesPaid, feesPending, year);
			break;
			case 2:
				for(Student s1:rec)
				{
					System.out.println(s1);
					System.out.println("\n");
				}
				break;
			case 3:
				
				break;
		}
	}

}