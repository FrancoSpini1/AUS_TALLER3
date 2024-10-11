package ar.com.fs.ordenador;

import java.util.Iterator;

import ar.com.fs.ordenable.*;

public class Ordenador {
	public void Ordenar(Ordenable []ord) {
		for (int i = 0; i < ord.length; i++) {
			for (int j = 0; j < ord.length; j++) {
				if(ord[i].compareTo(ord[j]) >0) {
					continue;
				}else if(ord[i].compareTo(ord[j]) <0){
					Ordenable tmp= ord[i];
					ord[i] = ord[j];
					ord[j] = tmp;
				}else {
					continue;
				}
			}
		}
		
	}
}
