/**
 * 
 */
package com.parsa.examples;

/**
 * @author ramesh
 *
 */
public class GenericDemo<T> extends Box<T> {
     Box<Integer> integerBox;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box<Integer> integerBox=new Box<>();
		Box rawBox=new Box();
		rawBox.setT(3);
		   integerBox.setT(10);
         System.out.println(integerBox.getT());
         System.out.println(rawBox.getT());
	}

}
