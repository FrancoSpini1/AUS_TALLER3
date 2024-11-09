package buscador;

import java.io.*;
import java.util.ArrayList;

public class Buscador {
	private File f;
	private ArrayList<String> rutaDestino= new ArrayList<>();

	public synchronized void buscarArchivo(File f,String arc){		//aca no se si poner  un synchronized 
		
		//si borro synchronized tarda mass pero lo encuentran todos juntos
		//en cambio si pongo syncronized tarda menos pero los buscan todos
		//(se debe a  una mala implementacion imagino que habra  que ver lo de wait, notify y
		//no se que mas)
		this.f=f;
		File[]files=f.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				buscarArchivo(files[i],arc);
			}
			if(files[i].getName().equals( arc) ) {
				System.out.println("EUREKA, ARCHIVO ENCONTRADO!!!");
				//notifyAll();
//				aca quisiera notificarle a los hilos que estan buscando en paralelo si uno encontro
//				lo pedido, notificar al resto y que los frene (poner en wait o algo)
//				se me ocurrio que el metodo en lugarr de void sea int, cosa de que si lo encontraste 
//				retorne 1, y asi preguntar en este mismo 'if' si dicho metodo ==1 entonces poner en wait
//				todo, o notificar ni idea
				try {
					rutaDestino.add(files[i].getCanonicalPath());
					System.out.println(files[i].getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	}
}
