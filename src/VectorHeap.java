



import java.lang.*;
import java.util.*;
public class VectorHeap<E extends Comparable<E>> implements Comparable<VectorHeap<E>>, PQueue<E>{
	public boolean add(E item){
		return true;
	}


	public void clear(){

	}


	public boolean contains(Object o){
		return true;
	}


	public E peek(){
		return null;
	}


	public boolean remove(Object o){
		return true;
	}	


	public int size(){
		return 0;
	}


	public int compareTo(VectorHeap<E> o){
		return 1;
	}
}