package practica4;

public class Principal {
	public static void main(String[] args) {
//		sistema de biblioteca
		Usuario u1=new Usuario("Franco Spini",36123);
		Libro l1=new Libro("diario de un amor no correspondido","Arnorld Fisher",300);
		Libro l2=new Libro("Clean Code","Robert C. Martin",420);
		Libro l3=new Libro("Festin de Cuervos","Jeroge R.R. Martin",872);
		Biblioteca b1=new Biblioteca();
		b1.ingresarLibro(l1);
		b1.ingresarLibro(l2);
		b1.ingresarLibro(l3);
		b1.listarLibrosDisponibles();
		b1.solicitaLibro(u1, l3.getNombre());
		System.out.println("#######################");
		b1.quitarLibro(l2);
		b1.listarLibrosDisponibles();
		
		
	}
}
