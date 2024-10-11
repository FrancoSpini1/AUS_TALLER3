package ar.com.fs.principal;
import ar.com.fs.ordenador.*;
import ar.com.fs.pelicula.*;
import ar.com.fs.ordenable.*;
public class Principal {
	public static void main(String[] args) {
		Ordenable[] arr= new Peliculas[4];
		arr[0] =new Peliculas("El señor de los Anillos",2001,"Peter Jackson");
		arr[1]=new Peliculas("Oppenheimer",2023,"Christopher Nolan");
		arr[2]=new Peliculas("Steve Jobs",2015,"Danny Boyle");
		arr[3]=new Peliculas("La Isla Siniestra",2010,"Martin Scorsese");
		Ordenador ord=new Ordenador();
		ord.Ordenar(arr);
		
		for (Ordenable o : arr) {
			if(o instanceof Ordenable) {
				Peliculas p = (Peliculas) o;
				System.out.println(p.getAño());
			}
		}
		
	}
}
