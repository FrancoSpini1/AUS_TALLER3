package practica4;

public class Libro {
	private String nombre;
	private String autor;
	private int paginas;
	
	public Libro(String nombre,String autor,int paginas) {
		this.nombre=nombre;
		this.autor=autor;
		this.paginas=paginas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public int getPaginas() {
		return paginas;
	}
	
}
