package hilos;
import java.io.File;
import java.io.IOException;

import buscador.Buscador;
public class Hilos implements Runnable{
	private File fuente;
	private String nombre;
	
	public Hilos(File f,String n) {
		this.fuente=f;
		this.nombre=n;
	}
	
	@Override
	public void run() {
		Buscador b1=new Buscador();
		try {
			b1.buscarArchivo(fuente, nombre);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		duda, cuando puse el b1.buscarArchivo(fuente, nombre); me salio lo del try-catch , pq???
		
	}
	
}
