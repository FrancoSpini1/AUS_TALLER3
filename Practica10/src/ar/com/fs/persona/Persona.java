package ar.com.fs.persona;
import ar.com.fs.ordenable.*;

public class Persona implements Ordenable{
	
	private String nombre;
	private int DNI;
	private int alturaCm;
	
	
	public Persona(String nombre, int DNI,int altura) {
		this.nombre=nombre;
	this.DNI=DNI;
	this.alturaCm=altura;
	}
	
	public int compareTo(Ordenable ord) {
		if(!(ord instanceof Persona)) {
			Persona p= (Persona) ord;
			return this.DNI- p.getAltura();
		}
		return 0;
	}

	private int getAltura() {
		return this.alturaCm;
	}
}
