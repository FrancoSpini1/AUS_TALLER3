package ar.com.fs.pelicula;

import ar.com.fs.ordenable.*;

public class Peliculas implements Ordenable{
	private String nombre;
	private int año;
	private String director;

	public Peliculas(String nombre,int año,String director) {
		this.nombre = nombre;
		this.año=año;
		this.director=director;
	}
	
	public int getAño(){
		return this.año;
	}
	
	
	public int compareTo(Ordenable ord) {
		
		if(ord instanceof Ordenable) {
			Peliculas 	p= (Peliculas) ord;
			return this.año - p.getAño();
		}
		return 0;
	}
	
}
