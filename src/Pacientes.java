

import java.lang.*;
public class Pacientes extends Comparable<E>{
	private String nombre;
	private String sintoma;
	private String nivel;

	Pacientes(String nombre, String sintoma, String nivel){
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.nivel = nivel;
	}

	Pacientes(){
		nombre = null;
		sintoma = null;
		nivel = null;
	}


	public String getNombre(){
		return nombre;
	}

	public String getSintoma(){
		return sintoma;
	}

	public String getNivel(){
		return nivel;
	}
}