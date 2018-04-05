package edu.handong.csee.java.prob2;
/**
 * This class has 2 constructor that has same name but has different signature.
 * @author KimSukJin
 * @since 180405
 */
public class Chicken {
	private String name;
	private double price;
	private int stars;
/**
 * This constructor is default constructor.
 */
	public Chicken() {
		this.name = "";
		this.price = 0.0;
		this.stars = 0;
	}
	/**
	 * This constructor receives 3 different parameters.
	 * @param name
	 * @param price
	 * @param stars
	 */

	public Chicken(String name, double price, int stars) {
		this.name = name;
		this.price = price;
		this.stars = stars;
	}

	public String getName() {
		return this.name;
	} // getting name

	public void setName(String name) {
		this.name = name;
	} //setting name

	public double getPrice() {
		return this.price;
	} //getting price

	public void setPrice(double price) {
		this.price = price;
	} //setting price

	public int getStars() {
		return this.stars;
	} //getting stars

	public void setStars(int stars) {
		this.stars = stars;
	} //setting starss
}
