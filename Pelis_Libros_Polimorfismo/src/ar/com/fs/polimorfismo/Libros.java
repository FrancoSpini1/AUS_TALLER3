package ar.com.fs.polimorfismo;

public class Libros implements Ordenable{
	
	private int año;
	private String nombre;
	private int paginas;
	
	public Libros(String nombre,int año,int paginas) {
		this.año=año;
		this.nombre=nombre;
		this.paginas=paginas;
	}
	
	public int getAño() {
		return año;
	}
	
	public int compareTo(Ordenable ord) {
		Libros l1 =(Libros) ord;
		return this.getAño()-l1.getAño();
	}
}
