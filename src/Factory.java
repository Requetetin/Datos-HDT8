


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