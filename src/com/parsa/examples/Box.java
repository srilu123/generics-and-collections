/**
 * 
 */
package com.parsa.examples;

/**
 * @author ramesh
 * Generic version of the Box class
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
	public T t;

	/**
	 * @return the t
	 */
	public T getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(T t) {
		this.t = t;
	}
	

}
