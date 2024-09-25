package ar.com.polimorfismo.ordenoPelis;

public class Libro implements Ordenable{
	private int añoPublicacion;
	private int cantPaginas;
	private String nombre;
	private String genero;

	@Override
	public int compareTo(Ordenable ord) {
		if(ord instanceof Libro) {
			Libro l = (Libro) ord;
			if(this.getAño() > l.getAño()) {
				return 1;
			}else if(this.getAño() < l.getAño()) {
				return -1;
			}else if (this.getAño() == l.getAño()){
				return 0;
			}		
		}
		return 0;
	}
	/*
 * @Constructor : public Libro(int año,int cantidad ,String nombre,String genero)
 * */
	public Libro(int año,int cantidad ,String nombre,String genero) {
		this.añoPublicacion = año;
		this.cantPaginas = cantidad;
		this.nombre = nombre;
		this.genero = genero;
	}
	public int getAño(){
		return this.añoPublicacion;
	}
}
