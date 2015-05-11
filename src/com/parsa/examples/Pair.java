/**
 * 
 */
package com.parsa.examples;

/**
 * @author ramesh
 *Generic Type Interface
 *@param <K>,<V> key and value are the parameters
 */
public interface Pair<K,V> {
K getKey();
V getValue();
}
