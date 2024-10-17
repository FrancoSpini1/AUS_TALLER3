package pila;

import java.util.*;
import java.lang.*;

/*
 * pila (con generics) que no acepta repetidos, y que maneje tanto el tamaño como los remove con exceptions
 * */

public class Pila<T> {
	private List <T> p;
	
	public Pila() {
		p=new ArrayList<>();
	}

	public void push(T i) throws TeBandeasteException, TieneRepetidosException {
		if(p.size()>10) {		//si el tamaño de la lista es menor a 10, puedo ingresar el elemento
			throw new TeBandeasteException();		//esta vaina tira en el caso que ingrese mas de 10 elementos
		}
		if(p.contains(i)) {		//esto del contains lo saque del chatgpt 
			throw new TieneRepetidosException();//esta otra vaina me dice en caso que tenga repetidos
		}
			p.add(i);
		//listo, lo de tamaño ya está :D
	}	
	
	public T pop() {
		return p.remove(p.size()-1);		
	}
	
	public int SizeList() {
		return p.size();
	}
	
	public boolean TieneRepetidos() throws TieneRepetidosException {		//esta me la corrigio chatgpt (en el 2do for y el .equals)
	    for (int i = 0; i < p.size(); i++) {
	        for (int j = i + 1; j < p.size(); j++) {  // j comienza en i + 1
	            if (p.get(i).equals(p.get(j))) {      // Comparar con .equals()
	                return true;  // Hay elementos repetidos
	            }
	        }
	    }
	    return false;  // No hay elementos repetidos
	}

}
