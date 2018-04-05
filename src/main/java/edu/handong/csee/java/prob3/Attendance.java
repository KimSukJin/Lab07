package edu.handong.csee.java.prob3;

import java.util.*;
/**
 * This class has 2 constructors that has same name but different signatures.
 * @author KimSukJin
 * @since 180405 
 */
public class Attendance {
	private String name = "";
	private int year = 0;
	private String student_id = "";
	private int missed = 0;
/**
 * This constructor is default constructor.
 * 
 */
	public Attendance() {
		this.name = "Null";
		this.year = 0;
		this.student_id = "Null";
		this.missed = 0;
	}
/**
 * This constructor receives 4 parameters.
 * @param Student's name
 * @param Students's year
 * @param student_id
 * @param missed
 */
	public Attendance(String name, int year, String student_id, int missed) {
		this.name = name;
		this.year = year;
		this.student_id = student_id;
		this.missed = missed;
	}

	public String getName() {
		return name;
	} //getting name

	public void setName(String name) {
		this.name = name;
	} //setting name

	public int getYear() {
		return year;
	} //getting year

	public void setYear(int year) {
		this.year = year;
	} //setting year

	public String getStudent_id() {
		return student_id;
	} //getting id

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	} //setting id

	public int getMissed() {
		return missed;
	} //getting missed

	public void setMissed(int missed) {
		this.missed = missed;
	} //setting missed
}
