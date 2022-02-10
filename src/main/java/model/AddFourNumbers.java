package model;

/**
 * @author jword - jord
 * CIS175 - Spring - 2022
 * Feb 9, 2022
 */
public class AddFourNumbers {
	
	private int userNum;
	private int numOne;
	private int numTwo;
	private int numThree;
	private int numFour;
	private int sum;
	/**
	 * 
	 */
	public AddFourNumbers() {
		super();
		// TODO Auto-generated constructor stub

	}




	/**
	 * @param sum
	 */
	public AddFourNumbers(int userNum) {
		super();
		this.userNum = userNum;
		
	}




	/**
	 * @return the userNum
	 */
	public int getUserNum() {
		return userNum;
	}




	/**
	 * @param userNum the userNum to set
	 */
	public void setUserNum(int userNum) {
		this.userNum = userNum;
		setAddFour(userNum);
	}




	/**
	 * @return the numOne
	 */
	public int getNumOne() {
		return numOne;
	}
	/**
	 * @param numOne the numOne to set
	 */
	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}
	/**
	 * @return the numTwo
	 */
	public int getNumTwo() {
		return numTwo;
	}
	/**
	 * @param numTwo the numTwo to set
	 */
	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	/**
	 * @return the numThree
	 */
	public int getNumThree() {
		return numThree;
	}
	/**
	 * @param numThree the numThree to set
	 */
	public void setNumThree(int numThree) {
		this.numThree = numThree;
	}
	/**
	 * @return the numFour
	 */
	public int getNumFour() {
		return numFour;
	}
	/**
	 * @param numFour the numFour to set
	 */
	public void setNumFour(int numFour) {
		this.numFour = numFour;
	}
	/**
	 * @return the sum
	 */
	public int getSum(int sum) {
		return sum;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
		
	}
	
	//logic to add the user numbers
	public void setAddFour(int userNum) {
		//int setUserNum;
		setUserNum(numOne + numTwo + numThree + numFour);
		
	}




	@Override
	public String toString() {
		return "AddFourNumbers [userNum=" + userNum + ", numOne=" + numOne + ", numTwo=" + numTwo + ", numThree="
				+ numThree + ", numFour=" + numFour + ", sum=" + sum + "]";
	}
	
	

	
	

}
