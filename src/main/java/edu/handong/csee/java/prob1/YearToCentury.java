package edu.handong.csee.java.prob1;

/**
 * This class has 2 constructors and 1 method.
 * 
 * @author KimSukJin
 *
 */
public class YearToCentury {
	int year = 0;

	/**
	 * This constructor is default constructor.
	 */
	public YearToCentury() {
		year = 0;
	}

	/**
	 * This constructor uses 'this' to call initial constructor.
	 * @param year that will be converted into century
	 */

	public YearToCentury(int year) {
		this.year = year;
	}

	/**
	 * This method converts year into century.
	 * 
	 * @return year converted into century
	 */
	public int calc_century() {
		if (year % 100 == 0)
			year = year / 100; //year divided by 100 do nothing. 
		else {
			year = (year / 100) + 1;
		}	//year not dived by 100 add one. 
		return year; //return year converted into century
	}

}
