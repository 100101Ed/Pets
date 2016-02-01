/**
 * File Name: Pets.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 30, 2016
 */
package com.sqa.em.pets;

/**
 * Pets //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Pets {

	private String type;

	private String name;

	private int age;

	private boolean hasRabies;

	private double petCosts;

	private char gender;

	/**
	 * @param type
	 * @param name
	 * @param age
	 * @param hasRabies
	 * @param petCosts
	 * @param gender
	 */
	public Pets(String type, String name, int age, boolean hasRabies, double petCosts, char gender) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.hasRabies = hasRabies;
		this.petCosts = petCosts;
		this.gender = gender;
	}

	public void eat() {
		System.out.println(getType() + " Eating my good food...");
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return this.gender;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the petCosts
	 */
	public double getPetCosts() {
		return this.petCosts;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return the hasRabies
	 */
	public boolean isHasRabies() {
		return this.hasRabies;
	}

	public void makeSound() {
		System.out.println("Sound, Loud " + getType() + " sound!!!");
	}

	public void move() {
		System.out.println(getType() + " moving all over the place!!!");
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @param hasRabies
	 *            the hasRabies to set
	 */
	public void setHasRabies(boolean hasRabies) {
		this.hasRabies = hasRabies;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param petCosts
	 *            the petCosts to set
	 */
	public void setPetCosts(double petCosts) {
		this.petCosts = petCosts;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pets [type=" + this.type + ", name=" + this.name + ", age=" + this.age + ", hasRabies=" + this.hasRabies
				+ ", petCosts=" + this.petCosts + ", gender=" + this.gender + "]";
	}
}
