package hilos;
import java.io.*;

import buscador.*;
public class Hilos implements Runnable{
	private Buscador b;
	private File src;
	private String nameFile;
	
	public Hilos(Buscador b,File f,String arc){
		this.b=b;
		this.src=f;
		this.nameFile=arc;
	}
	
	@Override
	public void run() {
		b.buscarArchivo(this.src,nameFile);
//		if(b.buscarArchivo(this.src,nameFile) ){
//			wait();
//			entonces asi lo que conssigo es que frenen la busqueda, pues ya hay un hilo que la terminó
//		}
	}
}
