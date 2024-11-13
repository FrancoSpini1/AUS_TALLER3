package ejercicio4;

public class Promedio {
	public float calcularPromedio(int[]notas) {
		float notasProm=0;
		for (int i = 0; i < notas.length; i++) {
			notasProm+=notas[i];
		}
		
		return(float) notasProm/notas.length;
	}
}
