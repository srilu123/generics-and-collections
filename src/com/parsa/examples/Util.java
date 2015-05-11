/**
 * 
 */
package com.parsa.examples;

/**
 * @author ramesh
 *
 */
public class Util {
	public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V>p2){
		return p1.getKey().equals(p1.getKey())&&
				p1.getValue().equals(p2.getValue());
		
	}
	public class Pair<K, V> {

	    private K key;
	    private V value;

	    public Pair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

		/**
		 * @return the key
		 */
		public K getKey() {
			return key;
		}

		/**
		 * @return the value
		 */
		public V getValue() {
			return value;
		}

		/**
		 * @param key the key to set
		 */
		public void setKey(K key) {
			this.key = key;
		}

		/**
		 * @param value the value to set
		 */
		public void setValue(V value) {
			this.value = value;
		}
	    
	}
	public static void main(String[] args){
		Util u=new Util();
		Util.Pair<Integer, String> p1 = u.new Pair<>(1, "apple");
		Util.Pair<Integer, String> p2 = u.new Pair<>(2, "pear");
		boolean same = Util.<Integer, String>compare(p1, p2);
		System.out.println(same);
		
	}
}
