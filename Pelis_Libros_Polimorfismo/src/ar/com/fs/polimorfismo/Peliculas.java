package ar.com.fs.polimorfismo;

public class Peliculas implements Ordenable{
	
	private String nombre;
	private int año;
	private long duracion;
	
	public Peliculas(String nombre,int año,long duracion) {
		this.nombre=nombre;
		this.año=año;
		this.duracion=duracion;
	}

	public int getAño() {
		return año;
	}
	
	public int compareTo(Ordenable ord) {
		Peliculas p1 = (Peliculas) ord;
		return this.getAño()-p1.getAño();
	}
	
}
