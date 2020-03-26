



import java.lang.*;
import java.util.*;
public class JCFPQueue<E> implements PQueue<E>{

	PriorityQueue<E> prq = new PriorityQueue<E>();

	public boolean add(E item){
		return prq.add(item);
	}


	public void clear(){
		prq.clear();
	}


	public boolean contains(Object o){
		return prq.contains(o);
	}


	public E peek(){
		return prq.peek();
	}


	public boolean remove(Object o){
		return prq.remove(o);
	}


	public int size(){
		return prq.size();
	}
}