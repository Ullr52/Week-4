package model;

/**
 * @author jword - jord
 * CIS175 - Spring - 2022
 * Feb 10, 2022
 */
public class InchesToMiles {
	
	private int units;
	private int miles;
	private int yards;
	private int feet;
	private int inches;
	/**
	 * 
	 */
	public InchesToMiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param units
	 */
	public InchesToMiles(int units) {
		super();
		this.units = units;
		setDistance(units);
	}
	/**
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}
	/**
	 * @param units the units to set
	 */
	public void setUnits(int units) {
		this.units = units;
		setDistance(units);
	}
	/**
	 * @return the miles
	 */
	public int getMiles() {
		return miles;
	}
	/**
	 * @param miles the miles to set
	 */
	public void setMiles(int miles) {
		this.miles = miles;
	}
	/**
	 * @return the yards
	 */
	public int getYards() {
		return yards;
	}
	/**
	 * @param yards the yards to set
	 */
	public void setYards(int yards) {
		this.yards = yards;
	}
	/**
	 * @return the feet
	 */
	public int getFeet() {
		return feet;
	}
	/**
	 * @param feet the feet to set
	 */
	public void setFeet(int feet) {
		this.feet = feet;
	}
	/**
	 * @return the inches
	 */
	public int getInches() {
		return inches;
	}
	/**
	 * @param inches the inches to set
	 */
	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public void setDistance(int units) {
		final int MILES = 5280; 
		final int YARDS = 3; 
		final int FEET = 12;

		int unitsLeft;
		setMiles(units / MILES);
		unitsLeft = units % MILES;
		setYards(unitsLeft / YARDS);
		unitsLeft = unitsLeft % YARDS;
		setFeet(unitsLeft / FEET);
		setInches(unitsLeft % FEET);
		
	}
	
	@Override
	public String toString() {
		return "InchesToMiles [units=" + units + ", miles=" + miles + ", yards=" + yards + ", feet=" + feet
				+ ", inches=" + inches + "]";
	}

	

}
