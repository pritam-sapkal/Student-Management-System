package com.niit;

import java.util.Set;

public class Student
{
	static{
		count=10000;
	}
	private int id,year;
	private static int count;
	private String fName,lName;
	private Set<String> courses;
	private int feesPaid,feesPending;
	public Student(String fName, String lName, Set<String> courses, int feesPaid, int feesPending,int year)
	{
		count++;
		this.id=count;
		this.fName = fName;
		this.lName = lName;
		this.courses = courses;
		this.feesPaid = feesPaid;
		this.feesPending = feesPending;
		this.year=year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getFeesPending() {
		return feesPending;
	}
	public void setFeesPending(int feesPending) {
		this.feesPending = feesPending;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", courses=" + courses + ", feesPaid="
				+ feesPaid + ", feesPending=" + feesPending + "]";
	}
	
	
}
