package ar.com.polimorfismo.ordenoPelis;

public class main {
	public static void main(String[] args) {
		Ordenable[] arr= new Libro[5];
		/*
		 * @Constructor : public Libro(int año,int cantidad ,String nombre,String genero)
		 * */
		arr[0]=new Libro(1977,300,"El Resplandor","terror");
		arr[1]=new Libro(1720,120,"Robison Crusoe","aventura");
		arr[2] = new Libro(1903,85,"EL llamado de la selva","ficcion");
		arr[3] = new Libro(1603,310,"Hamlet","tragedia");
		arr[4] = new Libro(1850,620,"David Copperfield","Ficcion autobiografica");
		
		Ordenador.Ordenar(arr);
		
		Libro[] libros = new Libro[5];
		for (int i = 0; i < libros.length; i++) {
			libros[i]= (Libro)arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(libros[i].getAño());
		}
	}
}
