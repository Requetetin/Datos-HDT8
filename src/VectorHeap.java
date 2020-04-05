/*
 * VectorHeap.java
 * Martin Amado Giron
 * 5-4-2020
 * 
 * Metodos para el VectorHeap
 * 
 * @author Martin Amado
 * 19020
 *
 *
 * Extraido de: Java Structures: Data Structures pagina 321 y 322
 *
 */



import java.lang.*;
import java.util.*;
public class VectorHeap<E extends Comparable<E>> implements PQueue<E>{

	protected Vector<E> vHeap;

	public VectorHeap(){
		vHeap = new Vector<E>();
	}

	public VectorHeap(Vector<E> v){
		vHeap = new Vector<E>(v.size());

		for(int i=0; i<v.size();i++){
			add(v.get(i));
		}
	}

	protected static int parent(int i){
		return(i-1)/2;
	}

	protected static int left(int i){
		return 2*i+1;
	}

	protected static int right(int i){
		return 2*(i+1);
	}


	protected void percolateUp(int leaf){
		int parent = parent(leaf);
		E value = vHeap.get(leaf);

		while(leaf>0 && (value.compareTo(vHeap.get(parent))<0)){
			vHeap.set(leaf, vHeap.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		vHeap.set(leaf, value);
	}



	protected void pushDownRoot(int root){
		int vSize = vHeap.size();
		E value = vHeap.get(root);
		while(root<vSize){
			int childpos = left(root);
			if(childpos<vSize){
				if((right(root)<vSize)&&((vHeap.get(childpos+1)).compareTo(vHeap.get(childpos))<0)){
					childpos++;
				}

				if((vHeap.get(childpos)).compareTo(value)<0){
					vHeap.set(root, vHeap.get(childpos));
					root = childpos;
				}else{
					vHeap.set(root, value);
					return;
				}
			}else{
				vHeap.set(root, value);
				return;
			}
			
		}
	}



	public void add(E item){
		vHeap.add(item);
		percolateUp(vHeap.size()-1);
	}

	public E remove(){
		E minVal = vHeap.get(0);

		vHeap.set(0, vHeap.get(vHeap.size()-1));
		vHeap.setSize(vHeap.size()-1);

		if(vHeap.size()>1){
			pushDownRoot(0);
		}
		return minVal;
	}	


	public int size(){
		return vHeap.size();
	}


	
}