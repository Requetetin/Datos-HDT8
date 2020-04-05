/*
 * Factory.java
 * Martin Amado Giron
 * 5-4-2020
 * 
 * Return patron de diseno factory
 * 
 * @author Martin Amado
 * 19020
 *
 *
 *
 */


public class Factory{
	
		

	public PQueue<Pacientes> chooseImp(int o){
		switch(o){
			case 1:
			return new JCFPQueue<Pacientes>();

			case 2:
			return new VectorHeap<Pacientes>();
		}
		return null;
	}
}