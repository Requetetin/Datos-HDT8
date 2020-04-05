/*
 * Pacientes.java
 * Martin Amado Giron
 * 5-4-2020
 * 
 * Objeto pacientes
 * 
 * @author Martin Amado
 * 19020
 *
 *
 *
 */

import java.lang.*;
public class Pacientes implements Comparable<Pacientes>{
	private String nombre;
	private String sintoma;
	private String nivel;

	public Pacientes(String nombre, String sintoma, String nivel){
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.nivel = nivel;
	}

	public Pacientes(){
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


	public int compareTo(Pacientes o){
		return nivel.compareTo(o.getNivel());
	}
}