package main;

import custom_annotation.MycustomAnnotation;
/**
 * <h1>Calculator</h1>
 * This Calculaotr program implements an application that 
 * can add two numbers,subtract two numbers,multiply two numbers
 * and divide two numbers and prints
 * the reslut on the screen
 * <p>
 * <b>Note:</b>Giving proper comments in your program makes it more user 
 * frinedly and it is assumed as a high a quality code.
 * @author Rakib-RS
 * @version 1.0
 * @since 2018-10-29
 */
/**
 * @MycustomAnnotation(
	 studentName = "Rakib",
	 stuAddress = "Rajshahi,Bangladesh "
 )
 */

public class Calculator {
	/**
	 * This method is used to add two integers
	 * @param numA This is the first parameter to add addNum method
	 * @param numB This is the second parameter to add addNum method	 
	 * @return double This returns sum of numA and numB.
	 */
	public double addNum(double numA,double numB) {
		return numA+numB;
	}
	/**
	 * This method is used to subtract two integers
	 * @param numA This is the first parameter to subtract subtractNum method
	 * @param numB This is the second parameter to subtract subtractNum method	 
	 * @return double This returns subtraction of numA and numB.
	 */
	public double subtractNum(double numA,double numB) {
		return numA-numB;
	}
	/**
	 * This method is used to multiply two integers
	 * @param numA This is the first parameter to multiply multiplyNum method
	 * @param numB This is the second parameter to multiply multiplyNum method	 
	 * @return double This returns product of numA and numB.
	 */
	public double multiplyNum(double numA,double numB) {
		return numA*numB;
	}
	/**
	 * This method is used to divide two integers
	 * @param numA This is the first parameter to divide divideNum method
	 * @param numB This is the second parameter to divide divideNum method	 
	 * @return double This returns quotient of numA and numB.
	 */
	public double divideNum(double numA,double numB) {
		return numA/numB;
	}
	public static void main(String[] args) {
		int a ,b;
		Calculator cal = new Calculator();
		System.out.println("ok");
		
	}
	
	

}
