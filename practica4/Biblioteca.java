package practica4;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Libro>libros=new ArrayList<>();
	public void ingresarLibro(Libro l1) {
		libros.add(l1);
	}

	public void quitarLibro(Libro l1) {		//funcion para "eliminar " el libro
		Libro[] ltmp= new Libro[libros.size()];
		libros.toArray(ltmp);
		for (int i = 0; i < ltmp.length; i++) {
			if(ltmp[i].getNombre().equals(l1.getNombre())) {
				libros.remove(i);
			}
		}
	}
	
	public void solicitaLibro(Usuario user,String nombreLibro) {//el libro no esta pero por un tiempo estimado
		Libro[] ltmp= new Libro[libros.size()];
		libros.toArray(ltmp);
		for (int i = 0; i < ltmp.length; i++) {
			if(ltmp[i].getNombre().equals(nombreLibro)) {
				user.setLibro(libros.get(i));
				libros.remove(i);
			}
		}
	}
	
	public void DevolverLibro(Usuario user) {
		libros.add(user.getLibro());
		user.setLibro(null);
	}
	
	public void listarLibrosDisponibles() {
		for (Libro l : libros) {
			System.out.println(l.getNombre());
		}
	}

}
