/**
 * 
 */
package com.parsa.examples;

/**
 * @author ramesh
 * @param <K>
 * @param <T>
 *
 */
public class OrderedPair<K, V> implements Pair<K, V> {
	private K key;
	private V value;

	public OrderedPair(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public OrderedPair(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OrderedPair<String,Integer> p1=new OrderedPair<String, Integer>("Lohit",11);
        OrderedPair<String, String> p2=new OrderedPair<String, String>("hello", "äkshay");
        System.out.println(p1.getValue());
        System.out.println(p2.getKey());
	}

	@Override
	public K getKey() {

		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

}
