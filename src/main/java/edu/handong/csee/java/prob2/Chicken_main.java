package edu.handong.csee.java.prob2;
/**
 * This class has main method.
 *  @author KimSukJin
 *  @since 180405
 *
 */
public class Chicken_main {

	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); //chicken named menu1 has name, price, and stars.
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5); //chicken named menu2 has name, price, and stars.
		Chicken menu3 = new Chicken("Spicey_mustard", 16000.00, 1); //chicken named menu3 has name, price, and stars.

		menu1.setStars(5); //Stars of menu1 has changed.
		menu2.setStars(2); //Stars of menu2 has changed.
		menu3.setStars(1); //Stars of menu3 has changed.

		System.out.println(menu1.getName() + "'s rating is " + menu1.getStars()); //print out menu1's name and stars
		System.out.println(menu2.getName() + "'s rating is " + menu2.getStars()); //print out menu2's name and stars
		System.out.println(menu3.getName() + "'s rating is " + menu3.getStars()); //print out menu3's name and stars
	}

}
