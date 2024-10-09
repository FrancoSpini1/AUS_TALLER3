package ar.com.fs.PuebaTecnica1;

public class PruebaTecnica1 {
	public static void main(String[] args) {
		/*PRUEBA DE ALGORITMO Y ESTRUCTURA DE DATOS
		 * escribe una funcion que encuentre el numero mas 
		 * grande en un arreglo de enteros*/
		int[]arr=new int[10];
		Ordenador o=new Ordenador();
		//cargo arreglo con 10 valores al azar de 1 a 40
		for (int i = 0; i < arr.length; i++) {
			int r=(int)(Math.random()*40+1);
			arr[i]=r;
		}
		
		//muestro el arreglo crudo
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("\n");
		//en teoria lo muestra ordenado
		System.out.println(o.ElMasGrande(arr));
		//tardé menos de 14 min en hacer esta prueba
	}
}
