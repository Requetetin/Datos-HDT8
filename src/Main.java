/*
 * Main.java
 * Martin Amado Giron
 * 5-4-2020
 * 
 * Main, encargado de realizar las operaciones
 * 
 * @author Martin Amado
 * 19020
 *
 *
 *
 */


import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Factory fact = new Factory();
		PQueue<Pacientes> data;

		Scanner scan = new Scanner(System.in);

		System.out.println("----------\nBienvenido\nQue Priority Queue desea usar?\n1. VectorHeap\n2. JCF Queue\n----------");

		boolean choosing = true;
		int chosen = 0;

		//Se crea el queue que ingrese el usuario
		while(choosing){
			try{
				int option = scan.nextInt();
				chosen = option;
				scan.nextLine();
				if(option == 1 || option == 2){
					
					choosing = false;
				}else{
					System.out.println("Escoja un numero valido");
				}
			}catch(Exception e){
				scan.nextLine();
				System.out.println("No ha escogido un valor entero");
			}
		}

		data = fact.chooseImp(chosen);
		try{
			String line = "";
			Scanner reader = new Scanner(new File("pacientes.txt"));
			while(reader.hasNextLine()){
				line = reader.nextLine();
				String[] partes = line.split(", ");
				data.add(new Pacientes(partes[0], partes[1], partes[2]));


			}
		}catch(Exception e){
			System.out.println("Existe un problema con el archivo");
		}

		Pacientes l;
		while(data.size()!=0){
			int i = 1;
			l = data.remove();

			System.out.println("\n\nPaciente #"+ i+ " ha sido atendido:\nNombre: "+ l.getNombre()+"\nSintoma: " +l.getSintoma()+"\nPrioridad: "+l.getNivel());
			i++;
		}
	}
}