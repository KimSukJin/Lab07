package edu.handong.csee.java.prob3;

import java.util.Random;
/**
 * This class has main method.
 * Setting students' information and Classifying students who failed or not
 * @author KimSukJin
 * @since 180405
 */
public class Attendance_main {

	public static void main(String[] args) {
		Attendance s_1 = new Attendance();
		Attendance s_2 = new Attendance();
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0); //setting student3's information by constructor named attendance
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0); //setting student4's information by constructor named attendance
/**
 * setting name, year, id, missed of student 1 and 2
 */
		s_1.setName("Jess");
		s_1.setYear(4);
		s_1.setStudent_id("21400999");
		s_1.setMissed(0);
		s_2.setName("Martha");
		s_2.setYear(2);
		s_2.setStudent_id("21700111");
		s_2.setMissed(0);
/**
 * Randomly generate missed (0~10) of all students
 */
		Random randomGenerator = new Random();

		s_1.setMissed(randomGenerator.nextInt(10));
		s_2.setMissed(randomGenerator.nextInt(10));
		s_3.setMissed(randomGenerator.nextInt(10));
		s_4.setMissed(randomGenerator.nextInt(10));
/**
 * Classifying students who failed or not
 * (If students' missed is greater than 6, they failed.)
 */
		if (s_1.getMissed() > 6) {
			System.out.println("I'm sorry " + s_1.getName() + ". You fail this course");
			System.out.println(s_1.getName() + " - Number of absence: " + s_1.getMissed());
		} else
			System.out.println("We'll see about the grade, " + s_1.getName());

		if (s_2.getMissed() > 6) {
			System.out.println("I'm sorry " + s_2.getName() + ". You fail this course");
			System.out.println(s_2.getName() + " - Number of absence: " + s_2.getMissed());
		} else
			System.out.println("We'll see about the grade, " + s_2.getName());
		if (s_3.getMissed() > 6) {
			System.out.println("I'm sorry " + s_3.getName() + ". You fail this course");
			System.out.println(s_3.getName() + " - Number of absence: " + s_3.getMissed());
		} else
			System.out.println("We'll see about the grade, " + s_3.getName());
		if (s_4.getMissed() > 6) {
			System.out.println("I'm sorry " + s_4.getName() + ". You fail this course");
			System.out.println(s_4.getName() + " - Number of absence: " + s_4.getMissed());
		} else
			System.out.println("We'll see about the grade, " + s_4.getName());

	}

}
