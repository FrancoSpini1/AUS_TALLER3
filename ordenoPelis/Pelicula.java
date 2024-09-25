package ar.com.polimorfismo.ordenoPelis;

public class Pelicula implements Ordenable{
	
	private String nombre;
	private String genero;
	private double duracion;
	
	@Override
	public int compareTo(Ordenable ord) {
		if(ord instanceof Pelicula) {
			Pelicula p = (Pelicula) ord;
			if(this.getDuracion() > p.getDuracion()) {
				return  1;
			}else if(this.getDuracion() < p.getDuracion()) {
				return -1;
			}else  {
				return 0;
			}
		}	
		return 0;
	}
	
	public Pelicula(String nombre,String genero,double duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public double getDuracion() {
		return this.duracion;
	}
}
