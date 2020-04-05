/*
 * JCFPQueue.java
 * Martin Amado Giron
 * 5-4-2020
 * 
 * Priority Queue implementado con Java Collections Framework
 * 
 * @author Martin Amado
 * 19020
 *
 *
 *
 */



import java.lang.*;
import java.util.*;
public class JCFPQueue<E> implements PQueue<E>{

	protected PriorityQueue<E> prq = new PriorityQueue<E>();

	public void add(E item){
		prq.add(item);
	}

	public E remove(){
		return prq.remove();
	}


	public int size(){
		return prq.size();
	}
}