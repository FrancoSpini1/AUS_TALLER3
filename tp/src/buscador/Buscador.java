package buscador;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Buscador {
	
	
	public void buscarArchivo(File f, String nombre) throws IOException {
		File[] archivos = f.listFiles();
		Scanner k = new Scanner (System.in);
		String tmp;
		for (int i = 0; i < archivos.length; i++) {
			if(archivos[i].isDirectory()) {
				buscarArchivo(archivos[i],nombre);
			}
			
			if(archivos[i].getName().equals(nombre)) {
				System.out.println("EUREKA, lo encontré");
				System.out.println(archivos[i].getAbsolutePath());
			
			}
		}
	}
}
