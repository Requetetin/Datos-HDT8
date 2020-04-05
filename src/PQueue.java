/*
 * PQueue.java
 * Martin Amado Giron
 * 5-4-2020
 * 
 * Interfaz del priority Queue
 * 
 * @author Martin Amado
 * 19020
 *
 *
 *
 */


public interface PQueue<E>{

	/*
	 * pre:Queue is not empty
	 * post: Removed top element
	 *
	 * param:
	 */
	public E remove();

	/*
	 * pre:
	 * post: New element added 
	 *
	 * param: item
	 */
	public void add(E item);

	/*
	 * pre: Queue is not empty
	 * post: 
	 *
	 * param:
	 */
	public int size();
}