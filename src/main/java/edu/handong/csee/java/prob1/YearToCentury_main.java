package edu.handong.csee.java.prob1;

import java.util.Scanner;

/**
 * This class has main method. This class uses Scanner object to get year from
 * user.
 * 
 * @author KimSukJin
 *
 */
public class YearToCentury_main {
	public static void main(String[] args) {
		int yr = 0;
		Scanner keyboard = new Scanner(System.in); //Scanner object named keyboard

		System.out.println("Input year: ");
		yr = keyboard.nextInt(); // get year from user and substitute yr

		YearToCentury year = new YearToCentury(yr); //object named year
		System.out.println(yr + " is " + year.calc_century() + "th century"); //printout

	}

}
