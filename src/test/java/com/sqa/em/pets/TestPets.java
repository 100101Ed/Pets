/**
 * File Name: TestPets.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 30, 2016
 */
package com.sqa.em.pets;

/**
 * TestPets //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class TestPets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pets cat = new Pets("Cat", "Felix", 10, true, 43.21, 'F');
		Pets dog = new Pets("dog", "burt", 4, false, 34.32, 'm');
		Pets snake = new Pets("snake", "ssss", 17, true, 34.21, 'f');
		Pets[] pets = { cat, dog, snake };
		for (Pets pet : pets) {
			System.out.println(pet);
			pet.eat();
			pet.makeSound();
			pet.move();
		}
	}
}
